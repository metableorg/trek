/**
 * <code>
 *
 * // Single inheritance example.
 *
 * type PlanFigure {
 *     double getArea();
 * }
 *
 * </code>
 */

package org.metable.trek.sandbox.type.planefigure;

import java.util.Arrays;
import java.util.List;

import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.polygon.Polygon;

public interface PlaneFigure {

    public static double getArea(PlaneFigure plane) {
        if (Ellipse.instanceOfEllipse(plane)) {
            return Ellipse.getArea(Ellipse.treatAsEllipse(plane));
        } else if (Polygon.instanceOfPolygon(plane)) {
            return Polygon.getArea(Polygon.treatAsPolygon(plane));
        }

        throw new java.lang.UnsupportedOperationException();
    }

    public static List<Class<?>> getSubtypes() {
        return Arrays.asList(Ellipse.class, Polygon.class);
    }

    public static boolean isType(Object value) {
        if (value instanceof PlaneFigure) {
            return true;
        }

        return false;
    }

    public static boolean instanceOfPlaneFigure(Object other) {
        if (Polygon.instanceOfPolygon(other)) {
            return true;
        }

        if (Ellipse.instanceOfEllipse(other)) {
            return true;
        }

        return PlaneFigure.isType(other);
    }

    public static boolean isEqual(PlaneFigure left, PlaneFigure right) {
        if (Polygon.instanceOfPolygon(left)) {
            return Polygon.isEqual(Polygon.treatAsPolygon(left), Polygon.treatAsPolygon(right));
        }

        return false;
    }
}
