package org.metable.trek.sandbox.type.elipse;

import org.metable.trek.sandbox.type.circle.Circle;
import org.metable.trek.sandbox.type.point.Point;

class EllipseImpl implements Ellipse {
    static class Rep {
        double a;
        double b;
        Point ctr;

        static boolean constraint(double a, double b) {
            return (a >= b);
        }

        Rep(double a, double b, Point ctr) {
            this.a = a;
            this.b = b;
            this.ctr = Point.point(ctr);
        }
    }

    EllipseImpl() {
    }

    Rep rep;

    @Override
    public Point getCtr() {
        return rep.ctr;
    }

    @Override
    public double getB() {
        return rep.b;
    }

    @Override
    public double getA() {
        return rep.a;
    }

    @Override
    public void setA(double a) {
        rep.a = a;
    }

    @Override
    public void setB(double b) {
        rep.b = b;
    }

    @Override
    public void setCtr(Point point) {
        rep.ctr = Point.point(point);
    }

    @Override
    public Class<?> getMostSpecificType() {
        if (Circle.isCircle(this)) {
            return Circle.class;
        }

        return Ellipse.class;
    }
}
