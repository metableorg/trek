package org.metable.trek.sandbox.type.elipse;

import org.metable.trek.sandbox.type.point.Point;

class EllipseImpl implements Ellipse {
    static class Ellipse {
        static boolean constraint(double a, double b) {
            return (a >= b);
        }
        double a;
        double b;

        Point ctr;

        Ellipse(double a, double b, Point ctr) {
            this.a = a;
            this.b = b;
            this.ctr = Point.point(ctr);
        }
    }

    Ellipse rep;

    EllipseImpl() {
    }

    double getA() {
        return rep.a;
    }

    double getB() {
        return rep.b;
    }

    Point getCtr() {
        return Point.point(rep.ctr);
    }

    void setA(double a) {
        rep.a = a;
        assert (Ellipse.constraint(a, getB()));
    }

    void setB(double b) {
        rep.b = b;
        assert (Ellipse.constraint(getA(), b));
    }

    void setCtr(Point point) {
        rep.ctr = Point.point(point);
    }
}
