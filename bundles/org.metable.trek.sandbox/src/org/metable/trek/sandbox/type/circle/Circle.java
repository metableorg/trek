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
import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.planefigure.PlaneFigure;
import org.metable.trek.sandbox.type.point.Point;

public interface Circle {

    // Assign Circle to Ellipse.
    public static Ellipse assign(Circle circle) {
        return Ellipse.ellipse(circle.getR(), circle.getR(), circle.getCtr());
    }

    public static Circle circle() {
        return circle(10, Point.cartesian(0, 0));
    }

    public static Circle circle(Circle circle) {
        return circle(circle.getR(), circle.getCtr());
    }

    public static Circle circle(double r, Point ctr) {
        CircleImpl circle = new CircleImpl();

        circle.rep = new CircleImpl.Circle(r, ctr);

        return circle;
    }

    public static double getArea(Circle circle) {
        return Math.PI * (circle.getR() * circle.getR());
    }

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
    }

    public static boolean instanceOfCircle(Object other) {
        Class<?> mst = Alpha.getMostSpecificType(other);
        return Circle.class.isAssignableFrom(mst);
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

    public static Circle treatAsCircle(Ellipse ellipse) {
        if (instanceOfCircle(ellipse)) {
            return circle(ellipse.getA(), ellipse.getCtr());
        }

        throw new java.lang.ClassCastException(
                "Can not cast " + Ellipse.class.getTypeName() + " to " + Circle.class.getTypeName());
    }

    public static Circle treatAsCircle(PlaneFigure planeFigure) {
        return Circle.treatAsCircle(Ellipse.treatAsEllipse(planeFigure));
    }

    public Point getCtr();

    public double getR();

    public void setCtr(Point ctr);

    public void setR(double r);
}
