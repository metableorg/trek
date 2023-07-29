/**
 * <code>
 *
 * // Single inheritance example.
 *
 * type Polygon extends PlanFigure {
 * }
 *
 * </code>
 */

package org.metable.trek.sandbox.type.polygon;

import java.util.Arrays;
import java.util.List;

import org.metable.trek.sandbox.type.planefigure.PlaneFigure;
import org.metable.trek.sandbox.type.rectangle.Rectangle;

public interface Polygon extends PlaneFigure {

    public static PlaneFigure assign(Polygon polygon) {
        return (PlaneFigure) polygon;
    }

    public static double getArea(Polygon polygon) {
        if (polygon instanceof Rectangle) {
            return Rectangle.getArea((Rectangle) polygon);
        }

        throw new java.lang.UnsupportedOperationException();
    }

    public static List<Class<?>> getSubtypes() {
        return Arrays.asList(Rectangle.class);
    }

    public static boolean isType(Object value) {
        if (value instanceof Polygon) {
            return true;
        }

        return false;
    }

    public static Polygon treatAsPolygon(PlaneFigure plane) {
        return (Polygon) plane;
    }

    public static boolean instanceOfPolygon(Object other) {
        if (Rectangle.instanceOfRectangle(other)) {
            return true;
        }

        return Polygon.isType(other);
    }

    public static boolean isEqual(Polygon left, Polygon right) {
        if (Rectangle.instanceOfRectangle(left)) {
            return Rectangle.isEqual(Rectangle.treatAsRectangle(left), Rectangle.treatAsRectangle(right));
        }

        throw new java.lang.UnsupportedOperationException();
    }

}
