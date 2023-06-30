package org.metable.trek.sandbox.type.point;

import org.metable.trek.sandbox.type.Alpha;

public interface Point extends Alpha {

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

    public static Point point() {
        return cartesian(0, 0);
    }

    double getX();

    double getY();

    void setX(double value);

    void setY(double value);

    void setRho(double value);

    void setTheta(double value);
}
