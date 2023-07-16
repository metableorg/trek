/**
 * <code>
 *
 * // Single inheritance example.
 *
 * type PlanFigure {
 * }
 *
 * </code>
 */

package org.metable.trek.sandbox.type.planefigure;

import java.util.Arrays;
import java.util.List;

import org.metable.trek.sandbox.type.ellipse.Ellipse;

public interface PlaneFigure {

    public static List<Class<?>> getSubtypes() {
        return Arrays.asList(Ellipse.class);
    }

    public static boolean isType(Object value) {
        if (value instanceof PlaneFigure) {
            return true;
        }

        return false;
    }
}
