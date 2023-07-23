package org.metable.trek.sandbox;

import org.junit.Assert;
import org.junit.Test;
import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.circle.Circle;
import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.noncircle.NonCircle;
import org.metable.trek.sandbox.type.planefigure.PlaneFigure;
import org.metable.trek.sandbox.type.polygon.Polygon;
import org.metable.trek.sandbox.type.rectangle.Rectangle;
import org.metable.trek.sandbox.type.square.Square;

public class Substitutability {

    @Test
    public void circle_is_assignable_to_ellipse() {
        // Arrange.
        Circle c = Circle.circle();

        // Act.
        Ellipse e = Circle.assign(c);

        // Assert.
        Assert.assertEquals(Circle.class, Alpha.getMostSpecificType(e));
    }

    @Test
    public void circle_is_instance_of_ellipse() {
        // Assert.
        Assert.assertTrue(Ellipse.instanceOfEllipse(Circle.circle()));
    }

    @Test
    public void ellipse_is_assignable_to_plane_figure() {
        // Arrange.
        Ellipse e = Ellipse.ellipse();

        // Act.
        PlaneFigure p = Ellipse.assign(e);

        // Assert.
        Assert.assertEquals(NonCircle.class, Alpha.getMostSpecificType(p));
    }

    @Test
    public void ellipse_is_instance_of_ellipse() {
        // Assert.
        Assert.assertTrue(Ellipse.instanceOfEllipse(Ellipse.ellipse()));
    }

    @Test
    public void ellipse_is_instance_of_plane_figure() {
        // Assert.
        Assert.assertTrue(PlaneFigure.instanceOfPlaneFigure(Ellipse.ellipse()));
    }

    @Test
    public void ellispe_is_assignable_to_plane_figure() {
        // Arrange.
        Ellipse e = Ellipse.ellipse();

        // Act.
        PlaneFigure plane = Ellipse.assign(e);

        // Assert.
        Assert.assertEquals(NonCircle.class, Alpha.getMostSpecificType(plane));
    }

    @Test
    public void non_circle_is_instance_of_ellipse() {
        // Assert.
        Assert.assertTrue(Ellipse.instanceOfEllipse(NonCircle.nonCircle()));
    }

    @Test
    public void plane_figure_get_area_is_polymorhpic_for_circle() {
        // Arrange.
        Circle c = Circle.circle();

        // Act.
        final double area = PlaneFigure.getArea(Ellipse.assign(Circle.assign(c)));

        // Assert.
        Assert.assertEquals(314.15926, area, 0.00001);
    }

    @Test
    public void plane_figure_get_area_is_polymorhpic_for_rectangle() {
        // Arrange.
        Rectangle r = Rectangle.rectangle();

        // Act.
        final double area = PlaneFigure.getArea(Polygon.assign(Rectangle.assign(r)));

        // Assert.
        Assert.assertEquals(50.0, area, 0.01);
    }

    @Test
    public void plane_figure_get_area_is_polymorhpic_for_square() {
        // Arrange.
        Square s = Square.square();

        // Act.
        final double area = PlaneFigure.getArea(Polygon.assign(Rectangle.assign(Square.assign(s))));

        // Assert.
        Assert.assertEquals(4.0, area, 0.01);
    }

    @Test
    public void plane_figure_get_area_is_polymorphic_for_ellipse() {
        // Arrange.
        Ellipse e = Ellipse.ellipse();

        // Act.
        final double area = PlaneFigure.getArea(Ellipse.assign(e));

        // Assert.
        Assert.assertEquals(157.07963, area, 0.00001);
    }

    @Test
    public void polygon_is_assignable_to_plane_figure() {
        // Arrange.
        Polygon p = Rectangle.assign(Rectangle.rectangle());

        // Act.
        PlaneFigure plane = Polygon.assign(p);

        // Assert.
        Assert.assertEquals(Rectangle.class, Alpha.getMostSpecificType(plane));
    }

    @Test
    public void polygon_is_instance_of_plane_figure() {
        // Assert.
        Assert.assertTrue(PlaneFigure.instanceOfPlaneFigure(Rectangle.rectangle()));
    }

    @Test
    public void rectangle_is_assignable_to_polygon() {
        // Arrange.
        Rectangle r = Rectangle.rectangle();

        // Act.
        Polygon p = Rectangle.assign(r);

        // Assert.
        Assert.assertEquals(Rectangle.class, Alpha.getMostSpecificType(p));
    }

    @Test
    public void rectangle_is_instance_of_polygon() {
        // Assert.
        Assert.assertTrue(Polygon.instanceOfPolygon(Rectangle.rectangle()));
    }

    @Test
    public void rectangle_is_instance_of_rectangle() {
        // Assert.
        Assert.assertTrue(Rectangle.instanceOfRectangle(Rectangle.rectangle()));
    }

    @Test
    public void square_is_assignable_to_rectangle() {
        // Arrange.
        Square s = Square.square();

        // Act.
        Rectangle r = Square.assign(s);
        r.setLength(500);

        // Assert.
        Assert.assertEquals(Rectangle.class, Alpha.getMostSpecificType(r));
    }

    @Test
    public void square_is_instance_of_rectangle() {
        // Assert.
        Assert.assertTrue(Rectangle.instanceOfRectangle(Square.square()));
    }

    @Test
    public void square_is_instance_of_square() {
        // Assert.
        Assert.assertTrue(Square.instanceOfSquare(Square.square()));
    }
}
