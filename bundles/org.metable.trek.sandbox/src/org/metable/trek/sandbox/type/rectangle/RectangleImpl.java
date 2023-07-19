package org.metable.trek.sandbox.type.rectangle;

import org.metable.trek.sandbox.type.point.Point;
import org.metable.trek.sandbox.type.polygon.Polygon;

class RectangleImpl implements Polygon, Rectangle {

    @Override
    public String toString() {
        return "RectangleImpl [rep=" + rep + "]";
    }

    static class Rectangle {
        @Override
        public String toString() {
            return "Rectangle [a=" + a + ", b=" + b + "]";
        }

        static boolean constraint(Rectangle rectangle) {
            final double length = rectangle.a.getX() - rectangle.b.getX();
            final double width = rectangle.a.getY() - rectangle.b.getY();
            return (rectangle.a.getX() > rectangle.b.getX())
                    && (rectangle.a.getY() > rectangle.b.getY() && (length != width));
        }

        Point a;
        Point b;

        Rectangle(Point a, Point b) {
            this.a = Point.point(a);
            this.b = Point.point(b);
            assert (constraint(this));
        }
    }

    Rectangle rep;

    RectangleImpl() {
    }

    @Override
    public Point getA() {
        return Point.point(rep.a);
    }

    @Override
    public void setA(Point a) {
        rep = new Rectangle(a, rep.b);
    }

    @Override
    public Point getB() {
        return Point.point(rep.b);
    }

    @Override
    public void setB(Point b) {
        rep = new Rectangle(rep.a, b);
    }
}
