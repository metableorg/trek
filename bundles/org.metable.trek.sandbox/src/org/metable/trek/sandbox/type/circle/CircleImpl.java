package org.metable.trek.sandbox.type.circle;

import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.point.Point;

public class CircleImpl implements Circle {

    static class Circle {
        static boolean constraint(Ellipse ellipse) {
            return (ellipse.getA() == ellipse.getB());
        }

        Ellipse ellipse;

        Circle(double r, Point ctr) {
            ellipse = Ellipse.ellipse(r, r, ctr);
            assert (constraint(ellipse));
        }
    }

    static {
        // Construct a valid Ellipse.
        Ellipse ellipse = Ellipse.ellipse(15, 11, Point.cartesian(0, 0));

        // Assert that the Ellipse is not a Circle. Therefore, Circle is a proper subset of Ellipse.
        assert (!Circle.constraint(ellipse));
    }

    Circle rep;

    @Override
    public Point getCtr() {
        return Point.point(rep.ellipse.getCtr());
    }

    @Override
    public double getR() {
        return rep.ellipse.getA();
    }

    @Override
    public void setCtr(Point ctr) {
        rep = new Circle(getR(), ctr);
    }

    @Override
    public void setR(double r) {
        rep = new Circle(r, getCtr());
    }
}
