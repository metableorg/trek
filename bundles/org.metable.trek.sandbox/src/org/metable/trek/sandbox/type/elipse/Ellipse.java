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

    // The Ellipse possible representation selector.
    public static Ellipse ellipse(double a, double b, Point ctr) {

        EllipseImpl ellipse = new EllipseImpl();

        ellipse.rep = new EllipseImpl.Ellipse(a, b, ctr);

        assert (isType(ellipse));

        return ellipse;
    }

    // Default Ellipse possible representation selector.
    public static Ellipse ellipse() {
        return ellipse(10, 5, Point.cartesian(0, 0));
    }

    // Copy Ellipse selector.
    public static Ellipse ellipse(Ellipse other) {
        EllipseImpl otherImpl = (EllipseImpl) other;
        return ellipse(otherImpl.getA(), otherImpl.getB(), otherImpl.getCtr());
    }

    // Assign Circle to Ellipse.
    public static Ellipse assign(Circle circle) {
        return ellipse(Circle.getR(circle), Circle.getR(circle), Circle.getCtr(circle));
    }

    // Assign NonCircle to Ellipse.
    public static Ellipse assign(NonCircle nonCircle) {
        return ellipse(NonCircle.getA(nonCircle), NonCircle.getB(nonCircle), NonCircle.getCtr(nonCircle));
    }

    // Test for Ellipse type.
    public static boolean isType(Object value) {
        if (value instanceof Ellipse) {
            return EllipseImpl.Ellipse.constraint(getA((Ellipse) value), getB((Ellipse) value));
        }

        return false;
    }

    public static List<Class<?>> getSubtypes() {
        return Arrays.asList(Circle.class, NonCircle.class);
    };

    public static double getA(Ellipse e) {
        return ((EllipseImpl) e).getA();
    }

    public static void setA(Ellipse e, double a) {
        ((EllipseImpl) e).setA(a);
    }

    public static double getB(Ellipse e) {
        return ((EllipseImpl) e).getB();
    }

    public static void setB(Ellipse e, double b) {
        ((EllipseImpl) e).setB(b);
    }

    public static Point getCtr(Ellipse e) {
        return ((EllipseImpl) e).getCtr();
    }

    public static void setCtr(Ellipse e, Point ctr) {
        ((EllipseImpl) e).setCtr(ctr);
    }

}
