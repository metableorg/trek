package org.metable.trek.sandbox;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
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

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void circleIsAssignableToEllipse() {
        // Arrange.
        Circle c = Circle.circle();

        // Act.
        Ellipse e = Circle.assign(c);

        // Assert.
        Assert.assertEquals(Circle.class, Alpha.getMostSpecificType(e));
    }

    @Test
    public void ellispeIsAssignableToPlaneFigure() {
        // Arrange.
        Ellipse e = Ellipse.ellipse();

        // Act.
        PlaneFigure plane = Ellipse.assign(e);

        // Assert.
        Assert.assertEquals(NonCircle.class, Alpha.getMostSpecificType(plane));
    }

    @Test
    public void planeFigureGetAreaForSquare() {
        // Arrange.
        Square s = Square.square();

        // Act.
        final double area = PlaneFigure.getArea(Polygon.assign(Rectangle.assign(Square.assign(s))));

        // Assert.
        Assert.assertEquals(4.0, area, 0.01);
    }

    @Test
    public void planeFigureGetAreaForCircle() {
        // Arrange.
        Circle c = Circle.circle();

        // Act.
        final double area = PlaneFigure.getArea(Ellipse.assign(Circle.assign(c)));

        // Assert.
        Assert.assertEquals(314.15926, area, 0.00001);
    }
}
