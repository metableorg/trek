package org.metable.trek.sandbox.type.point;

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
    public void setRho(double rho) {
        this.polar = new Polar(rho, polar.theta);
        this.cartesian = new Cartesian(polar);
    }

    @Override
    public void setTheta(double theta) {
        this.polar = new Polar(polar.rho, theta);
        this.cartesian = new Cartesian(polar);
    }

    @Override
    public Class<?> getMostSpecificType() {
        return Point.class;
    }
}
