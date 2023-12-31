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

        @Override
        public String toString() {
            return "Cartesian [x=" + x + ", y=" + y + "]";
        }
    }

    static class Polar {
        double rho;

        double theta;

        Polar(Cartesian cartesian) {
            rho = Math.sqrt((cartesian.x * cartesian.x) + (cartesian.y * cartesian.y));
            if (cartesian.x > 0) {
                theta = Math.toDegrees(Math.asin(cartesian.y / cartesian.x));
            } else {
                theta = 0;
            }
        }

        Polar(double rho, double theta) {
            this.rho = rho;
            this.theta = theta;
        }

        @Override
        public String toString() {
            return "Polar [rho=" + rho + ", theta=" + theta + "]";
        }
    }

    Cartesian cartesian;

    Polar polar;

    PointImpl() {
    }

    @Override
    public double getRho() {
        return polar.rho;
    }

    @Override
    public double getTheta() {
        return polar.theta;
    }

    @Override
    public double getX() {
        return cartesian.x;
    }

    @Override
    public double getY() {
        return cartesian.y;
    }

    @Override
    public boolean isEqual(Point other) {
        if ((this.getX() != other.getX()) || (this.getY() != other.getY())) {
            return false;
        }

        return true;
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
    public String toString() {
        return "PointImpl [cartesian=" + cartesian + ", polar=" + polar + "]";
    }
}
