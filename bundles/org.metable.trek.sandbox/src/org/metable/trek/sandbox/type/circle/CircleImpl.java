package org.metable.trek.sandbox.type.circle;

import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public class CircleImpl implements Circle {

    static class Circle {
        Ellipse ellipse;

        static boolean constraint(Ellipse ellipse) {
            return (ellipse.getA() == ellipse.getB());
        }

        Circle(double r, Point ctr) {
            ellipse = Ellipse.ellipse(r, r, ctr);
        }
    }

    Circle rep;

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

    @Override
    public void setCtr(Point point) {
        rep.ellipse.setCtr(point);
    }

    static {
        Ellipse ellipse = Ellipse.ellipse(15, 11, Point.cartesian(0, 0));
        assert (!Circle.constraint(ellipse));
    }
}
