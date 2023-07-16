/**
 * <code>
 *
 * type NonCircle extends Ellipse {
 *     rep NonCircle {
 *         Ellipse.a a;
 *         Ellipse.b b;
 *         Ellipse.ctr ctr;
 *
 *         constraint {
 *             Ellipse.a > Ellipse.b;
 *         }
 *
 *     not {
 *         Ellipse(1, 1, Cartesian(0, 0));
 *     }
 *
 *     init {
 *         NonCircle(10, 7, Cartesian(0, 0);
 *     }
 * }
 *
 *
 * </code>
 */

package org.metable.trek.sandbox.type.noncircle;

import java.util.Collections;
import java.util.List;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public interface NonCircle {

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
    }

    public static boolean isType(Object value) {
        if (value instanceof NonCircle) {
            return true;
        }

        if (value instanceof Ellipse) {
            return NonCircleImpl.NonCircle.constraint((Ellipse) value);
        }

        return false;
    }

    public static NonCircle nonCircle() {
        return nonCircle(10, 7, Point.cartesian(0, 0));
    }

    // The Ellipse possible representation selector.
    public static NonCircle nonCircle(double a, double b, Point ctr) {

        NonCircleImpl nonCircle = new NonCircleImpl();

        nonCircle.rep = new NonCircleImpl.NonCircle(a, b, ctr);

        return nonCircle;
    }

    public static void setA(NonCircle nc, double a) {
        ((NonCircleImpl) nc).setA(a);
    }

    public static void setB(NonCircle nc, double b) {
        ((NonCircleImpl) nc).setB(b);
    }

    public static void setCtr(NonCircle nc, Point ctr) {
        ((NonCircleImpl) nc).setCtr(ctr);
    }

    public static NonCircle treat_as_non_circle(Ellipse ellipse) {
        assert (NonCircle.class.isAssignableFrom(Alpha.getMostSpecificType(ellipse)));
        return nonCircle(ellipse.getA(), ellipse.getB(), ellipse.getCtr());
    }

    public double getA();

    public double getB();

    public Point getCtr();
}
