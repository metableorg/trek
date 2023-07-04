package org.metable.trek.sandbox.type.circle;

import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public class CircleImpl implements Circle {

    static class Circle {
        Ellipse ellipse;

        static boolean constraint(Ellipse ellipse) {
            return (Ellipse.getA(ellipse) == Ellipse.getB(ellipse));
        }

        Circle(double r, Point ctr) {
            ellipse = Ellipse.ellipse(r, r, ctr);
        }
    }

    Circle rep;

    static {
        // Construct a valid Ellipse.
        Ellipse ellipse = Ellipse.ellipse(15, 11, Point.cartesian(0, 0));

        // Assert that the Ellipse is not a Circle. Therefore, Circle is a proper subset of Ellipse.
        assert (!Circle.constraint(ellipse));
    }

    void setR(double r) {
        rep.ellipse = Ellipse.ellipse(r, r, Ellipse.getCtr(rep.ellipse));
    }

    double getR() {
        return Ellipse.getA(rep.ellipse);
    }

    void setCtr(Point point) {
        Ellipse.setCtr(rep.ellipse, point);
    }

    Point getCtr() {
        return Ellipse.getCtr(rep.ellipse);
    }
}
