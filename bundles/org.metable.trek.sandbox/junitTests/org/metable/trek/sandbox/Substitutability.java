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
}
