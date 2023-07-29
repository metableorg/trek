package org.metable.trek.sandbox;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.metable.trek.sandbox.type.circle.Circle;
import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.noncircle.NonCircle;
import org.metable.trek.sandbox.type.planefigure.PlaneFigure;
import org.metable.trek.sandbox.type.point.Point;
import org.metable.trek.sandbox.type.polygon.Polygon;
import org.metable.trek.sandbox.type.rectangle.Rectangle;
import org.metable.trek.sandbox.type.square.Square;

public class ImPrescriptions {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Test
    public void im_prescription_1_types_are_sets() {
        // Arrange.
        Rectangle r = Rectangle.rectangle(Point.cartesian(), 30, 30);
        Square s1 = Square.square(Point.cartesian(), 30);
        Square s2 = Square.square(Point.cartesian(), 30);

        // @formatter:off

        // Act.
        boolean result = PlaneFigure.isEqual(
                             Polygon.assign(Rectangle.assign(Square.assign(s1))),
                             Polygon.assign(Rectangle.assign(Square.assign(s2)))
                         );

        result = result && PlaneFigure.isEqual(
                               Polygon.assign(Rectangle.assign(Square.assign(s1))),
                               Polygon.assign(Rectangle.assign(r))
                           );

        // @formatter:on

        // Assert.
        Assert.assertTrue(result);
    }

    @Test
    public void im_prescription_2_subtypes_are_subsets() {
        // Square
        Assert.assertTrue(Rectangle.instanceOfRectangle(Square.square()));
        Assert.assertTrue(Polygon.instanceOfPolygon(Square.square()));
        Assert.assertTrue(PlaneFigure.instanceOfPlaneFigure(Square.square()));
        
        // Rectangle
        Assert.assertTrue(Polygon.instanceOfPolygon(Rectangle.rectangle()));
        Assert.assertTrue(PlaneFigure.instanceOfPlaneFigure(Rectangle.rectangle()));

        // Circle
        Assert.assertTrue(Ellipse.instanceOfEllipse(Circle.circle()));
        Assert.assertTrue(PlaneFigure.instanceOfPlaneFigure(Circle.circle()));

        // Non-circle
        Assert.assertTrue(Ellipse.instanceOfEllipse(NonCircle.nonCircle()));
        Assert.assertTrue(PlaneFigure.instanceOfPlaneFigure(NonCircle.nonCircle()));
        
        // Ellipse
        Assert.assertTrue(PlaneFigure.instanceOfPlaneFigure(Ellipse.ellipse()));
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}
