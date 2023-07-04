package org.metable.trek.sandbox.type;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;
import org.metable.trek.sandbox.type.weight.Weight;

public interface Alpha {
    @SuppressWarnings("unchecked")
    private static Class<?> getMostSpecificType(Class<?> type, Object value) {

        List<Class<?>> subtypes = Collections.emptyList();

        try {
            Method getSubTypes = type.getMethod("getSubtypes");
            subtypes = (List<Class<?>>) getSubTypes.invoke(null);
        } catch (RuntimeException | ReflectiveOperationException e) {
            throw new RuntimeException("Failed to invoke getSubtypes method", e);
        }

        for (Class<?> subType : subtypes) {
            Class<?> result = getMostSpecificType(subType, value);

            if (result != null) {
                return result;
            }
        }

        if (isType(value, type)) {
            return type;
        }

        return null;
    }

    public static Class<?> getMostSpecificType(Object value) {
        return getMostSpecificType(Alpha.class, value);
    }

    public static List<Class<?>> getSubtypes() {
        return Arrays.asList(Ellipse.class, Point.class, Weight.class);
    }

    public static boolean isType(Object alpha) {
        return true;
    }

    private static boolean isType(Object value, Class<?> type) {
        try {
            Method isType = type.getMethod("isType", Object.class);
            return (boolean) isType.invoke(null, value);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to invoke isType method", e);
        }
    }
}
