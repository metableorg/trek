package org.metable.trek.sandbox.type.elipse;

import org.metable.trek.sandbox.type.point.Point;

class EllipseImpl implements Ellipse {
    static class Ellipse {
        static boolean constraint(Ellipse ellipse) {
            return (ellipse.a >= ellipse.b);
        }

        double a;
        double b;

        Point ctr;

        Ellipse(double a, double b, Point ctr) {
            this.a = a;
            this.b = b;
            this.ctr = Point.point(ctr);
            assert (constraint(this));
        }
    }

    Ellipse rep;

    EllipseImpl() {
    }

    @Override
    public double getA() {
        return rep.a;
    }

    @Override
    public double getB() {
        return rep.b;
    }

    @Override
    public Point getCtr() {
        return Point.point(rep.ctr);
    }

    @Override
    public void setA(double a) {
        rep = new Ellipse(a, rep.b, rep.ctr);
    }

    @Override
    public void setB(double b) {
        rep = new Ellipse(rep.a, b, rep.ctr);
    }

    @Override
    public void setCtr(Point ctr) {
        rep = new Ellipse(rep.a, rep.b, ctr);
    }
}
