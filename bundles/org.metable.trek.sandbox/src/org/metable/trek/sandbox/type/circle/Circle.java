package org.metable.trek.sandbox.type.circle;

import java.util.Collections;
import java.util.List;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

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
public interface Circle extends Ellipse {

    public static Circle circle(double r, Point ctr) {
        CircleImpl circle = new CircleImpl();

        circle.rep = new CircleImpl.Circle(r, ctr);

        assert (isType(circle));

        return circle;
    }

    public static Circle circle() {
        return circle(10, Point.cartesian(0, 0));
    }

    public static Circle circle(Circle other) {
        return circle(other.getR(), other.getCtr());
    }

    public static boolean isType(Alpha alpha) {
        if (alpha instanceof Ellipse) {
            return CircleImpl.Circle.constraint((Ellipse) alpha);
        }

        return false;
    }

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
    }

    public double getR();
}
