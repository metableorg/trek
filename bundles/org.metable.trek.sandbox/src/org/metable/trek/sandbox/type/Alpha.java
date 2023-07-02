package org.metable.trek.sandbox.type;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public interface Alpha {
    public static List<Class<?>> getSubtypes() {
        return Arrays.asList(Ellipse.class, Point.class);
    }

    public static boolean isType(Alpha alpha) {
        return true;
    }

    private static boolean isType(Alpha value, Class<?> type) {
        try {
            Method isType = type.getMethod("isType", Alpha.class);
            return (boolean) isType.invoke(null, value);
        } catch (RuntimeException | ReflectiveOperationException e) {
            e.printStackTrace();
            assert (false);
        }

        return false;
    }

    default Class<?> getMostSpecificType() {
        return getMostSpecificType(Alpha.class);
    }

    @SuppressWarnings("unchecked")
    private Class<?> getMostSpecificType(Class<?> type) {

        List<Class<?>> subtypes = Collections.emptyList();

        try {
            Method getSubTypes = type.getMethod("getSubtypes");
            subtypes = (List<Class<?>>) getSubTypes.invoke(null);
        } catch (RuntimeException | ReflectiveOperationException e) {
            e.printStackTrace();
            assert (false);
        }

        for (Class<?> subType : subtypes) {
            Class<?> result = getMostSpecificType(subType);

            if (result != null) {
                return result;
            }
        }

        if (isType(this, type)) {
            return type;
        }

        return null;
    }
}
