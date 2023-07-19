package org.metable.trek.sandbox.type.noncircle;

import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public class NonCircleImpl implements NonCircle {

    static class NonCircle {
        static boolean constraint(Ellipse ellipse) {
            return (ellipse.getA() > ellipse.getB());
        }

        Ellipse ellipse;

        NonCircle(double a, double b, Point ctr) {
            ellipse = Ellipse.ellipse(a, b, ctr);
            assert (constraint(ellipse));
        }
    }

    static {
        Ellipse ellipse = Ellipse.ellipse(1, 1, Point.cartesian(0, 0));
        assert (!NonCircle.constraint(ellipse));
    }

    NonCircle rep;

    @Override
    public double getA() {
        return rep.ellipse.getA();
    }

    @Override
    public double getB() {
        return rep.ellipse.getB();
    }

    @Override
    public Point getCtr() {
        return rep.ellipse.getCtr();
    }

    public void setA(double a) {
        rep = new NonCircle(a, getB(), getCtr());
    }

    public void setB(double b) {
        rep = new NonCircle(getA(), b, getCtr());
    }

    public void setCtr(Point ctr) {
        rep = new NonCircle(getA(), getB(), ctr);
    }
}
