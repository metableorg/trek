/**
 * <code>
 *
 * // Type definition.
 * type Rectangle extends Polygon {
 *
 *     // Possible representation with default name 'Rectangle'.
 *     rep {
 *         Point a;
 *         Point b;
 *
 *         // Constraint definition. A boolean expression that
 *         // is a function of this possible representation's attributes
 *         // only.
 *         //
 *         // At least one attribute must be used in this expression.
 *         constraint {
 *             double length = a.x - b.x;
 *             double width = a.y - b.y;
 *             ((a.x > b.x) && (a.y > b.y) && (length != width));
 *         }
 *     }
 *
 *     // Default value.
 *     init {
 *         Rectangle(Cartesian(2, 1), Cartesian(-2, -1));
 *     }
 *     
 *     double getLength();
 *     
 *     double getWidth();
 * }
 *
 * </code>
 */

package org.metable.trek.sandbox.type.rectangle;

import java.util.Collections;
import java.util.List;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.point.Point;
import org.metable.trek.sandbox.type.polygon.Polygon;

/**
 * Interface Rectangle
 */
public interface Rectangle {

    public static Polygon assign(Rectangle rectangle) {
        return (Polygon) rectangle;
    }

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
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
        return rectangle(Point.cartesian(2, 1), Point.cartesian(-2, -1));
    }

    // The Rectangle possible representation selector.
    public static Rectangle rectangle(Point a, Point b) {

        RectangleImpl rectangle = new RectangleImpl();

        rectangle.rep = new RectangleImpl.Rectangle(a, b);

        return rectangle;
    }

    // Copy Rectangle selector.
    public static Rectangle rectangle(Rectangle other) {
        RectangleImpl otherImpl = (RectangleImpl) other;
        return rectangle(otherImpl.getA(), otherImpl.getB());
    }

    public static Rectangle treatAsRectangle(Polygon polygon) {
        Class<?> mst = Alpha.getMostSpecificType(polygon);

        for (Class<?> type : Rectangle.getSubtypes()) {
            if (type.isAssignableFrom(mst)) {
                RectangleImpl rectangle = (RectangleImpl) polygon;
                return rectangle(rectangle);
            }
        }

        if (Rectangle.class.isAssignableFrom(mst)) {
            RectangleImpl rectangle = (RectangleImpl) polygon;
            return rectangle(rectangle);
        }

        throw new java.lang.ClassCastException(
                "Can not cast " + mst.getTypeName() + " to " + Rectangle.class.getTypeName());
    }

    public Point getA();

    public Point getB();

    public void setA(Point a);

    public void setB(Point b);

    public static double getLength(Rectangle r) {
        return r.getA().getX() - r.getB().getX();
    }

    public static double getWidth(Rectangle r) {
        return r.getA().getY() - r.getB().getY();
    }

    public static double getArea(Rectangle r) {
        return getLength(r) * getWidth(r);
    }
}
