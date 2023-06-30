package org.metable.trek.sandbox.type.elipse;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.point.Point;

/**
 * <code> 
 * 
 * type Ellipse {
 *     rep {double a; double b; Point ctr constraint {a >= b;}}
 *     init {a = 10; b = 5; ctr = Cartesian(0, 0);}}
 * </code>
 */
public interface Ellipse extends Alpha {

    public static Ellipse ellipse() {
        EllipseImpl ellipse = new EllipseImpl();

        ellipse.rep = new EllipseImpl.Rep(10, 5, Point.cartesian(0, 0));

        return ellipse;
    }

    public static Ellipse ellipse(double a, double b, Point ctr) {

        EllipseImpl ellipse = new EllipseImpl();

        ellipse.rep = new EllipseImpl.Rep(a, b, ctr);

        assert (isEllipse(ellipse.rep.a, ellipse.rep.b));

        return ellipse;
    }

    public static Ellipse ellipse(Ellipse other) {
        EllipseImpl ellipse = new EllipseImpl();

        ellipse.rep = new EllipseImpl.Rep(other.getA(), other.getB(), other.getCtr());

        return ellipse;
    }

    public static boolean isEllipse(double a, double b) {
        return EllipseImpl.Rep.constraint(a, b);
    }

    public double getA();

    public double getB();

    public Point getCtr();

    public void setCtr(Point point);

    public void setA(double a);

    public void setB(double b);
}
