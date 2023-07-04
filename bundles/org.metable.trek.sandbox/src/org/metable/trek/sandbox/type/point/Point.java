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

    public static Point cartesian(double x, double y) {
        PointImpl point = new PointImpl();

        point.cartesian = new PointImpl.Cartesian(x, y);
        point.polar = new PointImpl.Polar(point.cartesian);

        return point;
    }

    public static Point polar(double rho, double theta) {
        PointImpl point = new PointImpl();

        point.polar = new PointImpl.Polar(rho, theta);
        point.cartesian = new PointImpl.Cartesian(point.polar);

        assert (PointImpl.Polar.constraint(point.polar));

        return point;
    }

    public static Point point(Point point) {
        return cartesian(point.getX(), point.getY());
    }

    public static boolean isType(Object value) {
        return (value instanceof Point);
    }

    public static Point cartesian() {
        return cartesian(0, 0);
    }

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
    }

    double getX();

    double getY();

    void setX(double value);

    void setY(double value);

    void setRho(double value);

    void setTheta(double value);
}
