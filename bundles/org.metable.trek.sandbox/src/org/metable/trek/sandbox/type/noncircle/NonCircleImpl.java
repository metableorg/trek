package org.metable.trek.sandbox.type.noncircle;

import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public class NonCircleImpl implements NonCircle {

    static class NonCircle {
        Ellipse ellipse;

        static boolean constraint(Ellipse ellipse) {
            return (Ellipse.getA(ellipse) > Ellipse.getB(ellipse));
        }

        NonCircle(double a, double b, Point ctr) {
            ellipse = Ellipse.ellipse(a, b, ctr);
        }
    }

    NonCircle rep;

    double getA() {
        return Ellipse.getA(rep.ellipse);
    }

    double getB() {
        return Ellipse.getB(rep.ellipse);
    }

    Point getCtr() {
        return Ellipse.getCtr(rep.ellipse);
    }

    void setA(double a) {
        rep.ellipse = Ellipse.ellipse(a, getB(), getCtr());
        assert (NonCircle.constraint(rep.ellipse));
    }

    void setB(double b) {
        rep.ellipse = Ellipse.ellipse(getA(), b, getCtr());
        assert (NonCircle.constraint(rep.ellipse));
    }

    void setCtr(Point ctr) {
        rep.ellipse = Ellipse.ellipse(getA(), getB(), ctr);
    }

    static {
        Ellipse ellipse = Ellipse.ellipse(1, 1, Point.cartesian(0, 0));
        assert (!NonCircle.constraint(ellipse));
    }
}
