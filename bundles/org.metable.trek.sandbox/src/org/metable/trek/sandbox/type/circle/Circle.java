package org.metable.trek.sandbox.type.circle;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

/**
 * <code> 
 * 
 * type Circle extends Ellipse {
 *     rep Circle (Ellipse.a r, Ellipse.ctr ctr) {constraint (Ellispe.a == Ellipse.b)};
 *     
 *     rep {Ellipse.a r; Ellipse.ctr ctr constraint {Ellipse.a == Ellipse.b;}}
 *     
 *     not {Ellipse(10, 5, Cartesian(0, 0));}
 *     
 *     init {r = 10; ctr = Cartesian(0, 0);}
 *     
 *     Circle from Ellipse {
 *     
 *     
 *     
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

    public static Circle circle() {
        CircleImpl circle = new CircleImpl();

        circle.rep = new CircleImpl.Rep(10, Point.cartesian(0, 0));

        assert (isCircle(circle.rep.ellipse));

        return circle;
    }
    
    public static boolean isCircle(Ellipse ellipse) {
        return CircleImpl.Rep.constraint(ellipse);
    }

    public double getR();
}
