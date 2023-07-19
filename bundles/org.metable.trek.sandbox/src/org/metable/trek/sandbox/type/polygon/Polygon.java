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

    public static List<Class<?>> getSubtypes() {
        return Arrays.asList(Rectangle.class);
    }

    public static boolean isType(Object value) {
        if (value instanceof Polygon) {
            return true;
        }

        return false;
    }

    public static PlaneFigure assign(Polygon polygon) {
        return (PlaneFigure) polygon;
    }

    public static double getArea(PlaneFigure plane) {
        if (plane instanceof Rectangle) {
            return Rectangle.getArea((Rectangle) plane);
        }

        throw new java.lang.UnsupportedOperationException();
    }

}
