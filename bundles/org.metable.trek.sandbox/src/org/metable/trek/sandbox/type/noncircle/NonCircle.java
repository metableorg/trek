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
import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public interface NonCircle {

    // The Ellipse possible representation selector.
    public static NonCircle nonCircle(double a, double b, Point ctr) {

        NonCircleImpl nonCircle = new NonCircleImpl();

        nonCircle.rep = new NonCircleImpl.NonCircle(a, b, ctr);

        assert (isType(nonCircle.rep.ellipse));

        return nonCircle;
    }

    public static NonCircle nonCircle() {
        return nonCircle(10, 7, Point.cartesian(0, 0));
    }

    public static NonCircle treat_as_non_circle(Ellipse ellipse) {
        assert (NonCircle.class.isAssignableFrom(Alpha.getMostSpecificType(ellipse)));
        return nonCircle(Ellipse.getA(ellipse), Ellipse.getB(ellipse), Ellipse.getCtr(ellipse));
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

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
    }

    public static double getA(NonCircle nc) {
        return ((NonCircleImpl) nc).getA();
    }

    public static void setA(NonCircle nc, double a) {
        ((NonCircleImpl) nc).setA(a);
    }

    public static double getB(NonCircle nc) {
        return ((NonCircleImpl) nc).getB();
    }

    public static void setB(NonCircle nc, double b) {
        ((NonCircleImpl) nc).setB(b);
    }

    public static Point getCtr(NonCircle nc) {
        return ((NonCircleImpl) nc).getCtr();
    }

    public static void setCtr(NonCircle nc, Point ctr) {
        ((NonCircleImpl) nc).setCtr(ctr);
    }
}
