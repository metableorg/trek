/**
 * <code>
 *
 * // Type definition.
 * type Ellipse {
 *
 *     // Possible representation with default name 'Ellipse'.
 *     rep {
 *         double a;
 *         double b;
 *         Point ctr;
 *
 *         // Constraint definition. A boolean expression that
 *         // is a function of this possible representation's attributes
 *         // only.
 *         //
 *         // At least one attribute must be used in this expression.
 *         constraint {
 *             a >= b;
 *         }
 *     }
 *
 *     // Default value.
 *     init {
 *         Ellipse(10, 5, Cartesian(0, 0);
 *     }
 * }
 *
 * </code>
 */

package org.metable.trek.sandbox.type.elipse;

import java.util.Arrays;
import java.util.List;

import org.metable.trek.sandbox.type.circle.Circle;
import org.metable.trek.sandbox.type.noncircle.NonCircle;
import org.metable.trek.sandbox.type.point.Point;

/**
 * Interface Ellipse
 */
public interface Ellipse {

    // Default Ellipse possible representation selector.
    public static Ellipse ellipse() {
        return ellipse(10, 5, Point.cartesian(0, 0));
    }

    // The Ellipse possible representation selector.
    public static Ellipse ellipse(double a, double b, Point ctr) {

        EllipseImpl ellipse = new EllipseImpl();

        ellipse.rep = new EllipseImpl.Ellipse(a, b, ctr);

        return ellipse;
    }

    // Copy Ellipse selector.
    public static Ellipse ellipse(Ellipse other) {
        EllipseImpl otherImpl = (EllipseImpl) other;
        return ellipse(otherImpl.getA(), otherImpl.getB(), otherImpl.getCtr());
    }

    public static List<Class<?>> getSubtypes() {
        return Arrays.asList(Circle.class, NonCircle.class);
    }

    // Test for Ellipse type.
    public static boolean isType(Object value) {
        if (value instanceof Ellipse) {
            return EllipseImpl.Ellipse.constraint(((EllipseImpl.Ellipse) value));
        }

        return false;
    }

    public double getA();

    public double getB();

    public Point getCtr();

    public void setA(double a);

    public void setB(double b);

    public void setCtr(Point ctr);
}
