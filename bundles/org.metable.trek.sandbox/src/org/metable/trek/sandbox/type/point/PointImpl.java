package org.metable.trek.sandbox.type.point;

/**
 * <code> 
 * 
 * TYPE Point
 *     POSSREP Cartesian (x RATIONAL, y RATIONAL)    
 *     POSSREP Polar (rho RATIONAL, theta RATIONAL CONSTRAINT theta >= 0.0 AND theta <= 360.0) 
 * INIT
 *     Polar (rho := SQRT((x * x) + (y * y)), theta := ARCTAN(y/x)) 
 *     Cartesian (x := rho * COS(theta), y := rho *SIN(theta);
 *    
 *     
 *  type Point {
 *      rep Cartesian(double x, double y);
 *      rep Polar(double rho, double theta) {constraint (theta >= 0.0 && theta <= 360.0)};
 *      
 *      rep Cartesian {double x; double y;}
 *      rep Polar {double rho; double theta; constraint {theta >= 0.0 && theta <= 360.0;}}
 *      
 *      Cartesian from Polar {x = rho * cos(theta); y = rho * sin(theta);}
 *      Polar from Cartesian {rho = sqrt((x * x) + (y * y)); theta = arctan(y/x);}
 *      
 *      init {Cartesian(0, 0);}
 *  }
 *  
 *  var Point point = Point.Cartesian(0, 0);
 *     
 *	</code>
 */
class PointImpl implements Point {
    static class Cartesian {
        final double x;
        final double y;

        Cartesian(double x, double y) {
            this.x = x;
            this.y = y;
        }

        Cartesian(Polar polar) {
            x = polar.rho * Math.cos(polar.theta);
            y = polar.rho * Math.sin(polar.theta);
        }
    }

    static class Polar {
        double rho;
        double theta;

        static boolean constraint(Polar polar) {
            return (polar.theta >= 0.0 && polar.theta <= 360.0);
        }

        Polar(double rho, double theta) {
            this.rho = rho;
            this.theta = theta;
        }

        Polar(Cartesian cartesian) {
            rho = Math.sqrt((cartesian.x * cartesian.x) + (cartesian.y * cartesian.y));
            theta = Math.asin(cartesian.y / cartesian.x);
        }
    }

    PointImpl() {
    }

    Cartesian cartesian;
    Polar polar;

    @Override
    public double getX() {
        return cartesian.x;
    }

    @Override
    public double getY() {
        return cartesian.y;
    }

    @Override
    public void setX(double x) {
        this.cartesian = new Cartesian(x, cartesian.y);
        this.polar = new Polar(cartesian);
    }

    @Override
    public void setY(double y) {
        this.cartesian = new Cartesian(cartesian.x, y);
        this.polar = new Polar(cartesian);
    }

    @Override
    public void setRho(double value) {
    }

    @Override
    public void setTheta(double value) {
    }

    @Override
    public Class<?> getMostSpecificType() {
        return Point.class;
    }
}
