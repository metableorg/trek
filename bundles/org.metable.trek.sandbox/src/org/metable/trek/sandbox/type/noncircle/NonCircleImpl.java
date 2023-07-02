package org.metable.trek.sandbox.type.noncircle;

import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public class NonCircleImpl implements NonCircle {

    static class NonCircle {
        Ellipse ellipse;

        static boolean constraint(Ellipse ellipse) {
            return (ellipse.getA() > ellipse.getB());
        }

        NonCircle(double a, double b, Point ctr) {
            ellipse = Ellipse.ellipse(a, b, ctr);
        }
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

    @Override
    public void setA(double a) {
        rep.ellipse = Ellipse.ellipse(a, getB(), getCtr());
    }

    @Override
    public void setB(double b) {
        rep.ellipse = Ellipse.ellipse(getA(), b, getCtr());
    }

    static {
        Ellipse ellipse = Ellipse.ellipse(1, 1, Point.cartesian(0, 0));
        assert (!NonCircle.constraint(ellipse));
    }

    @Override
    public void setCtr(Point point) {
        rep.ellipse.setCtr(point);
    }

    static {
        Ellipse ellipse = Ellipse.ellipse(1, 1, Point.cartesian(0, 0));
        assert (!NonCircle.constraint(ellipse));
    }
}
