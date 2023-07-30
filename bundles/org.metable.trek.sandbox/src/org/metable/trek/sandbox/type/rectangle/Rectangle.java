/**
 * <code>
 *
 * // Type definition.
 * type Rectangle extends Polygon {
 *
 *     // Possible representation with default name 'Rectangle'.
 *     rep {
 *         Point ctr;
 *         double length;
 *         double width;
 *
 *         // Constraint definition. A boolean expression that
 *         // is a function of this possible representation's attributes
 *         // only.
 *         //
 *         // At least one attribute must be used in this expression.
 *         constraint {
 *             (length > 0) && (width > 0);
 *         }
 *     }
 *
 *     // Default value.
 *     init {
 *         Rectangle(Cartesian(0, 0), 2, 1);
 *     }
 *     
 *     Point getCtr();
 *     
 *     double getLength();
 *     
 *     double getWidth();
 * }
 *
 * </code>
 */

package org.metable.trek.sandbox.type.rectangle;

import java.util.Arrays;
import java.util.List;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.point.Point;
import org.metable.trek.sandbox.type.polygon.Polygon;
import org.metable.trek.sandbox.type.square.Square;

/**
 * Interface Rectangle
 */
public interface Rectangle {

    public static Polygon assign(Rectangle rectangle) {
        return (Polygon) rectangle;
    }

    public static double getArea(Rectangle r) {
        if (Square.instanceOfSquare(r)) {
            return Square.getArea(Square.treatAsSquare(r));
        }

        return r.getLength() * r.getWidth();
    }

    public static List<Class<?>> getSubtypes() {
        return Arrays.asList(Square.class);
    }

    // Test for Rectangle type.
    public static boolean isType(Object value) {
        if (value instanceof Rectangle) {
            return true;
        }

        return false;
    }

    // Default Rectangle possible representation selector.
    public static Rectangle rectangle() {
        return rectangle(Point.cartesian(0, 0), 10, 5);
    }

    // The Rectangle possible representation selector.
    public static Rectangle rectangle(Point ctr, double length, double width) {

        RectangleImpl rectangle = new RectangleImpl();

        rectangle.rep = new RectangleImpl.Rectangle(ctr, length, width);

        return rectangle;
    }

    // Copy Rectangle selector.
    public static Rectangle rectangle(Rectangle other) {
        RectangleImpl otherImpl = (RectangleImpl) other;
        return rectangle(otherImpl.getCtr(), otherImpl.getLength(), otherImpl.getWidth());
    }

    public static Rectangle treatAsRectangle(Polygon polygon) {
        if (instanceOfRectangle(polygon)) {
            RectangleImpl rectangle = (RectangleImpl) polygon;
            return rectangle(rectangle);
        }

        throw new java.lang.ClassCastException(
                "Can not cast " + Polygon.class.getTypeName() + " to " + Rectangle.class.getTypeName());
    }

    public static boolean instanceOfRectangle(Object other) {
        Class<?> mst = Alpha.getMostSpecificType(other);

        for (Class<?> type : Rectangle.getSubtypes()) {
            if (type.isAssignableFrom(mst)) {
                return true;
            }
        }

        return Rectangle.class.isAssignableFrom(mst);
    }

    public Point getCtr();

    public double getLength();

    public double getWidth();

    public void setCtr(Point ctr);

    public void setLength(double length);

    public void setWidth(double width);

    public static boolean isEqual(Rectangle left, Rectangle right) {
        if (Square.instanceOfSquare(left)) {
            return Square.isEqual(Square.treatAsSquare(left), Square.treatAsSquare(right));
        }

        if (!Point.isEqual(left.getCtr(), right.getCtr())) {
            return false;
        }

        if (left.getLength() != right.getLength()) {
            return false;
        }

        if (left.getWidth() != right.getWidth()) {
            return false;
        }

        return true;
    }
}
