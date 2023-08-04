package org.metable.trek.sandbox.type;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.metable.trek.sandbox.type.linesegment.LineSegment;
import org.metable.trek.sandbox.type.planefigure.PlaneFigure;
import org.metable.trek.sandbox.type.point.Point;
import org.metable.trek.sandbox.type.weight.Weight;

@SuppressWarnings("unchecked")
public interface Alpha {
    private static Class<?> getMostSpecificType(Class<?> type, Object value) {

        final List<Class<?>> subtypes = getSubtypes(type);

        for (Class<?> subtype : subtypes) {
            Class<?> result = getMostSpecificType(subtype, value);

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
        return Arrays.asList(PlaneFigure.class, Point.class, Weight.class, LineSegment.class);
    }

    private static List<Class<?>> getSubtypes(Class<?> type) {
        try {
            Method getSubtypes = type.getMethod("getSubtypes");
            return (List<Class<?>>) getSubtypes.invoke(null);
        } catch (RuntimeException | ReflectiveOperationException e) {
            throw new RuntimeException("Failed to invoke getSubtypes method", e);
        }
    }

    /**
     * @param type1 the first type
     * 
     * @param type2 the second type
     * 
     * @return true if the first type is a supertype of the second type.
     */
    public static boolean isSupertypeOf(Class<?> type1, Class<?> type2) {
        if (type1 == type2) {
            return true;
        }

        final List<Class<?>> subtypes = getSubtypes(type1);

        if (subtypes.contains(type2)) {
            return true;
        }

        for (Class<?> subtype : subtypes) {
            if (isSupertypeOf(subtype, type2)) {
                return true;
            }
        }

        return false;
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
