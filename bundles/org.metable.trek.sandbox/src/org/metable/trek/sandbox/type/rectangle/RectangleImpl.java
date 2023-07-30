package org.metable.trek.sandbox.type.rectangle;

import org.metable.trek.sandbox.type.point.Point;
import org.metable.trek.sandbox.type.polygon.Polygon;

class RectangleImpl implements Polygon, Rectangle {

    static class Rectangle {

        static boolean constraint(Rectangle rectangle) {
            return (rectangle.length > 0) && (rectangle.width > 0);
        }

        final Point ctr;

        final double length;
        final double width;
        Rectangle(Point ctr, double length, double width) {
            this.ctr = Point.point(ctr);
            this.length = length;
            this.width = width;
            assert (constraint(this));
        }

        @Override
        public String toString() {
            return "Rectangle [ctr=" + ctr + ", length=" + length + ", width=" + width + "]";
        }
    }

    Rectangle rep;

    RectangleImpl() {
    }

    @Override
    public Point getCtr() {
        return Point.point(rep.ctr);
    }

    @Override
    public double getLength() {
        return rep.length;
    }

    @Override
    public double getWidth() {
        return rep.width;
    }

    @Override
    public void setCtr(Point ctr) {
        rep = new Rectangle(ctr, rep.length, rep.width);
    }

    @Override
    public void setLength(double length) {
        rep = new Rectangle(rep.ctr, length, rep.width);
    }

    @Override
    public void setWidth(double width) {
        rep = new Rectangle(rep.ctr, rep.length, width);
    }

    @Override
    public String toString() {
        return "RectangleImpl [rep=" + rep + "]";
    }
}
