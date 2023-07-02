package org.metable.trek.sandbox.type.elipse;

import java.util.Arrays;
import java.util.List;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.circle.Circle;
import org.metable.trek.sandbox.type.noncircle.NonCircle;
import org.metable.trek.sandbox.type.point.Point;

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

/**
 * Interface Ellipse
 */
public interface Ellipse extends Alpha {

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
        return ellipse(other.getA(), other.getB(), other.getCtr());
    }

    // Test for Ellipse type.
    public static boolean isType(Alpha alpha) {

        if (alpha instanceof Ellipse) {
            Ellipse value = (Ellipse) alpha;
            return EllipseImpl.Ellipse.constraint(value.getA(), value.getB());
        }

        return false;
    }

    public static List<Class<?>> getSubtypes() {
        return Arrays.asList(Circle.class, NonCircle.class);
    };

    public double getA();

    public double getB();

    public Point getCtr();

    public void setCtr(Point point);

    public void setA(double a);

    public void setB(double b);
}
