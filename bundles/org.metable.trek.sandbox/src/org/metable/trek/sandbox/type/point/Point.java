/**
 * <code>
 *
 *  type Point {
 *
 *      rep Cartesian {
 *          double x;
 *          double y;
 *      }
 *
 *      rep Polar {
 *          double rho;
 *          double theta;
 *
 *          constraint {
 *              theta >= 0.0 && theta <= 360.0;
 *          }
 *      }
 *
 *      // Show how to translate between possible representations.
 *
 *      Cartesian from Polar {
 *          x = rho * cos(theta);
 *          y = rho * sin(theta);
 *      }
 *
 *      Polar from Cartesian {
 *          rho = sqrt((x * x) + (y * y));
 *          theta = arctan(y/x);
 *      }
 *
 *      init {
 *          Cartesian(0, 0);
 *      }
 *  }
 *
 *  </code>
 */
package org.metable.trek.sandbox.type.point;

import java.util.Collections;
import java.util.List;

public interface Point {

    public static Point cartesian() {
        return cartesian(0, 0);
    }

    public static Point cartesian(double x, double y) {
        PointImpl point = new PointImpl();

        point.cartesian = new PointImpl.Cartesian(x, y);
        point.polar = new PointImpl.Polar(point.cartesian);

        return point;
    }

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
    }

    public static boolean isType(Object value) {
        return (value instanceof Point);
    }

    public static Point point(Point point) {
        return cartesian(point.getX(), point.getY());
    }

    public static Point polar(double rho, double theta) {
        PointImpl point = new PointImpl();

        point.polar = new PointImpl.Polar(rho, theta);
        point.cartesian = new PointImpl.Cartesian(point.polar);

        return point;
    }

    public double getRho();

    public double getTheta();

    public double getX();

    public double getY();

    boolean isEqual(Point other);

    public void setRho(double rho);

    public void setTheta(double theta);

    public void setX(double x);

    public void setY(double y);

    public static boolean isEqual(Point left, Point right) {
        if (left.getX() != right.getX()) {
            return false;
        }

        if (left.getY() != left.getY()) {
            return false;
        }

        return true;
    }
}
