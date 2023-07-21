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

public class SpecializationByConstraint {

    @Test(expected = java.lang.ClassCastException.class)
    public void can_not_cast_ellipse_with_unequal_a_and_b_to_circle() {
        // Arrange.
        Ellipse e = Ellipse.ellipse(20, 5, Point.cartesian());

        // Act.
        Circle.treatAsCircle(e);

        // Assert.
        // See @Test declaration.
    }

    @Test
    public void should_be_circle_when_ellipse_has_equal_a_and_b() {
        // Arrange.
        Ellipse e = Ellipse.ellipse(20, 5, Point.cartesian());
        final Class<?> ellipseMst = Alpha.getMostSpecificType(e);

        // Act.
        e.setB(e.getA());
        final Class<?> mst = Alpha.getMostSpecificType(e);

        // Assert.
        Assert.assertEquals(NonCircle.class, ellipseMst);
        Assert.assertEquals(Circle.class, mst);
    }

    @Test
    public void should_be_non_circle_when_ellipse_has_unequal_a_and_b() {
        // Arrange.
        Ellipse e = Ellipse.ellipse(20, 20, Point.cartesian());
        final Class<?> ellipseMst = Alpha.getMostSpecificType(e);

        // Act.
        e.setB(e.getA() - 5);
        final Class<?> mst = Alpha.getMostSpecificType(e);

        // Assert.
        Assert.assertEquals(Circle.class, ellipseMst);
        Assert.assertEquals(NonCircle.class, mst);
    }

    @Test
    public void should_be_square_when_rectangle_has_equal_width_and_height() {
        // Arrange.
        Rectangle r = Rectangle.rectangle(Point.cartesian(), 20, 5);
        final Class<?> rectangleMst = Alpha.getMostSpecificType(r);

        // Act.
        r.setWidth(r.getLength());
        final Class<?> mst = Alpha.getMostSpecificType(r);

        // Assert.
        Assert.assertEquals(Rectangle.class, rectangleMst);
        Assert.assertEquals(Square.class, mst);
        Assert.assertTrue(Square.instanceOfSquare(r));
    }
}
