package org.metable.trek.sandbox.type.noncircle;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

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
 *             a > b;
 *         }
 *     
 *     not {Ellipse(1, 1, Cartesian(0, 0));}
 *     
 *     init {
 *         NonCircle(10, 7, Cartesian(0, 0);
 *     }
 * }
 * 
 * 
 * </code>
 */
public interface NonCircle extends Alpha, Ellipse {

    // The Ellipse possible representation selector.
    public static NonCircle nonCircle(double a, double b, Point ctr) {

        NonCircleImpl nonCircle = new NonCircleImpl();

        nonCircle.rep = new NonCircleImpl.NonCircle(a, b, ctr);

        assert (isNonCircle(nonCircle.rep.ellipse));

        return nonCircle;
    }

    public static NonCircle nonCircle() {
        return nonCircle(10, 7, Point.cartesian(0, 0));
    }

    public static NonCircle nonCircle(NonCircle other) {
        return nonCircle(other.getA(), other.getB(), other.getCtr());
    }

    public static boolean isNonCircle(Ellipse ellipse) {
        return NonCircleImpl.NonCircle.constraint(ellipse);
    }

}
