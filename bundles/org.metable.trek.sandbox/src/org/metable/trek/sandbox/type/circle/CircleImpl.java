package org.metable.trek.sandbox.type.circle;

import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public class CircleImpl implements Circle {

    static class Rep {
        Ellipse ellipse;

        static boolean constraint(Ellipse ellipse) {
            return (ellipse.getA() == ellipse.getB());
        }

        Rep(double r, Point ctr) {
            ellipse = Ellipse.ellipse(r, r, ctr);
        }
    }

    Rep rep;

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
    public double getR() {
        return rep.ellipse.getA();
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
        Ellipse ellipse = Ellipse.ellipse(10, 5, Point.cartesian(0, 0));
        assert (!Rep.constraint(ellipse));
    }

    @Override
    public void setCtr(Point point) {
        rep.ellipse.setCtr(point);
    }

    @Override
    public Class<?> getMostSpecificType() {
        return rep.ellipse.getMostSpecificType();
    }
}
