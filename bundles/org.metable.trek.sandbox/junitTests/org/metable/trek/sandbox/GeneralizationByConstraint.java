package org.metable.trek.sandbox;

import org.junit.Assert;
import org.junit.Test;
import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.circle.Circle;
import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.noncircle.NonCircle;
import org.metable.trek.sandbox.type.point.Point;
import org.metable.trek.sandbox.type.rectangle.Rectangle;
import org.metable.trek.sandbox.type.square.Square;

public class GeneralizationByConstraint {

    @Test
    public void should_be_circle_when_non_circle_has_equal_a_and_b() {
        // Arrange.
        Ellipse e = NonCircle.assign(NonCircle.nonCircle());
        final Class<?> nonCircleMst = Alpha.getMostSpecificType(e);

        // Act.
        e.setB(e.getA());
        final Class<?> mst = Alpha.getMostSpecificType(e);

        // Assert.
        Assert.assertEquals(NonCircle.class, nonCircleMst);
        Assert.assertEquals(Circle.class, mst);
    }

    @Test
    public void should_be_non_circle_when_circle_has_unequal_a_and_b() {
        // Arrange.
        Ellipse e = Circle.assign(Circle.circle(50, Point.cartesian()));
        final Class<?> circleMst = Alpha.getMostSpecificType(e);

        // Act.
        e.setB(e.getA() - 5);
        final Class<?> mst = Alpha.getMostSpecificType(e);

        // Assert.
        Assert.assertEquals(Circle.class, circleMst);
        Assert.assertEquals(NonCircle.class, mst);
    }

    @Test
    public void should_be_rectangle_when_square_has_unequal_width_and_height() {
        // Arrange.
        Rectangle r = Square.assign(Square.square(Point.cartesian(), 50));
        final Class<?> squareMst = Alpha.getMostSpecificType(r);

        // Act.
        r.setWidth(r.getLength() - 5);
        final Class<?> mst = Alpha.getMostSpecificType(r);

        // Assert.
        Assert.assertEquals(Square.class, squareMst);
        Assert.assertEquals(Rectangle.class, mst);
    }
}
