package org.metable.trek.sandbox.type.square;

import org.metable.trek.sandbox.type.point.Point;
import org.metable.trek.sandbox.type.rectangle.Rectangle;

public class SquareImpl implements Square {

    static class Square {

        static boolean constraint(Rectangle rectangle) {
            return (rectangle.getLength() == rectangle.getWidth());
        }

        final Rectangle rectangle;

        Square(Point ctr, double length) {
            rectangle = Rectangle.rectangle(ctr, length, length);
            assert (constraint(rectangle));
        }

        @Override
        public String toString() {
            return "Square [rectangle=" + rectangle + "]";
        }
    }

    static {
        // Construct a valid Ellipse.
        Rectangle rectangle = Rectangle.rectangle(Point.cartesian(0, 0), 2, 1);

        // Assert that the Rectangle is not a Square. Therefore, Square is a proper subset of Rectangle.
        assert (!Square.constraint(rectangle));
    }

    Square rep;

    @Override
    public Point getCtr() {
        return Point.point(rep.rectangle.getCtr());
    }

    @Override
    public double getLength() {
        return rep.rectangle.getLength();
    }

    @Override
    public void setCtr(Point ctr) {
        rep = new Square(ctr, getLength());
    }

    @Override
    public void setLength(double length) {
        rep = new Square(getCtr(), length);
    }

    @Override
    public String toString() {
        return "SquareImpl [rep=" + rep + "]";
    }

}
