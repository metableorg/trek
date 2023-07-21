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
        if (plane instanceof Ellipse) {
            return Ellipse.getArea((Ellipse) plane);
        } else if (plane instanceof Polygon) {
            return Polygon.getArea((Polygon) plane);
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
}
