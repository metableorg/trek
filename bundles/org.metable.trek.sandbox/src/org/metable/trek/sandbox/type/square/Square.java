/**
 * <code>
 *
 * // Single inheritance example.
 *
 * type Square extends Rectangle {
 *     rep {
 *         Rectangle.length length; // length is an alias for Rectangle.length
 *         Rectangle.ctr ctr;
 *
 *         constraint {
 *             Rectangle.width = Rectangle.length;
 *         }
 *     }
 *
 *     not {
 *         // Proof that Square defines a proper subset of Rectangle.
 *         // The 'not' clause demonstrates that there exists at least one
 *         // valid Rectangle that is not a Square.
 *         Rectangle(Cartesian(0, 0), 2, -1);
 *     }
 *
 *     init {
 *         Square(Cartesian(0, 0), 2);
 *     }
 * }
 *
 *
 * </code>
 */

package org.metable.trek.sandbox.type.square;

import java.util.Collections;
import java.util.List;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.planefigure.PlaneFigure;
import org.metable.trek.sandbox.type.point.Point;
import org.metable.trek.sandbox.type.polygon.Polygon;
import org.metable.trek.sandbox.type.rectangle.Rectangle;

public interface Square {

    // Assign Square to Rectangle.
    public static Rectangle assign(Square square) {
        return Rectangle.rectangle(square.getCtr(), square.getLength(), square.getLength());
    }

    public static double getArea(Square s) {
        return s.getLength() * s.getLength();
    }

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
    }

    public static boolean instanceOfSquare(Object other) {
        Class<?> mst = Alpha.getMostSpecificType(other);

        return Square.class.isAssignableFrom(mst);
    }

    public static boolean isType(Object value) {
        if (value instanceof Square) {
            return true;
        }

        if (value instanceof Rectangle) {
            return SquareImpl.Square.constraint((Rectangle) value);
        }

        return false;
    }

    public static Square square() {
        return square(Point.cartesian(0, 0), 2);
    }

    public static Square square(Point ctr, double length) {
        SquareImpl square = new SquareImpl();

        square.rep = new SquareImpl.Square(ctr, length);

        return square;
    }

    public static Square square(Square square) {
        return square(square.getCtr(), square.getLength());
    }

    public static Square treatAsSquare(PlaneFigure planeFigure) {
        return Square.treatAsSquare(Rectangle.treatAsRectangle(Polygon.treatAsPolygon(planeFigure)));
    }

    public static Square treatAsSquare(Polygon polygon) {
        return Square.treatAsSquare(Rectangle.treatAsRectangle(polygon));
    }

    public static Square treatAsSquare(Rectangle rectangle) {
        if (instanceOfSquare(rectangle)) {
            return square(rectangle.getCtr(), rectangle.getLength());
        }

        throw new java.lang.ClassCastException(
                "Can not cast " + Rectangle.class.getTypeName() + " to " + Square.class.getTypeName());
    }

    public Point getCtr();

    public double getLength();

    public void setCtr(Point ctr);

    public void setLength(double length);
}
