package org.metable.trek.sandbox.type.circle;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

/**
 * <code> 
 * 
 * type Circle extends Ellipse {
 *     rep {
 *         Ellipse.a r; // r is an alias for Ellipse.a
 *         Ellipse.ctr ctr; // ctr is an alias for Ellipe.ctr
 *         
 *         constraint {
 *             Ellipse.a == Ellipse.b; // Same as r == Ellipse.b
 *         }
 *     }
 *     
 *     not {
 *         Ellipse(10, 5, Cartesian(0, 0));
 *     }
 *     
 *     init {
 *         Circle(10, Cartesian(0, 0);
 *     }
 * }
 * 
 * 
 * Circle circle;
 *
 * circle.setR(25.0);
 * 
 * </code>
 */
public interface Circle extends Alpha, Ellipse {

    public static Circle circle(double r, Point ctr) {
        CircleImpl circle = new CircleImpl();

        circle.rep = new CircleImpl.Rep(r, ctr);

        assert (isCircle(circle.rep.ellipse));

        return circle;
    }

    public static Circle circle() {
        return circle(10, Point.cartesian(0, 0));
    }

    public static Circle circle(Circle other) {
        return circle(other.getR(), other.getCtr());
    }

    public static boolean isCircle(Ellipse ellipse) {
        return CircleImpl.Rep.constraint(ellipse);
    }

    public double getR();
}
