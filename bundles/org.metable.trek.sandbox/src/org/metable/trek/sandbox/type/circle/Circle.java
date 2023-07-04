/**
 * <code> 
 *
 * // Single inheritance example.
 * 
 * type Circle extends Ellipse {
 *     rep {
 *         Ellipse.a r;     // r is an alias for Ellipse.a
 *         Ellipse.ctr ctr; // ctr is an alias for Ellipe.ctr
 *         
 *         constraint {
 *             Ellipse.a == Ellipse.b; // Same as r == Ellipse.b
 *         }
 *     }
 *     
 *     not {
 *         // Proof that Circle defines a proper subset of Ellipse.
 *         // The 'not' clause demonstrates that there exists at least one
 *         // valid Ellipse that is not a Circle.
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

package org.metable.trek.sandbox.type.circle;

import java.util.Collections;
import java.util.List;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public interface Circle {

    public static Circle circle(double r, Point ctr) {
        CircleImpl circle = new CircleImpl();

        circle.rep = new CircleImpl.Circle(r, ctr);

        return circle;
    }

    public static Circle circle() {
        return circle(10, Point.cartesian(0, 0));
    }

    public static Circle treat_as_circle(Ellipse ellipse) {
        assert (Circle.class.isAssignableFrom(Alpha.getMostSpecificType(ellipse)));
        return circle(Ellipse.getA(ellipse), Ellipse.getCtr(ellipse));
    }

    public static boolean isType(Object value) {
        if (value instanceof Circle) {
            return true;
        }

        if (value instanceof Ellipse) {
            return CircleImpl.Circle.constraint((Ellipse) value);
        }

        return false;
    }

    public static double getR(Circle c) {
        return ((CircleImpl) c).getR();
    }

    public static void setR(Circle c, double r) {
        ((CircleImpl) c).setR(r);
    }
    
    public static Point getCtr(Circle c) {
        return ((CircleImpl) c).getCtr();
    }

    public static void setCtr(Circle c, Point ctr) {
        ((CircleImpl) c).setCtr(ctr);
    }

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
    }
}
