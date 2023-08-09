package org.metable.trek.sandbox;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.circle.Circle;
import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.linesegment.LineSegment;
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
    public void im_prescription_01_types_are_sets() {
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
    public void im_prescription_02_subtypes_are_subsets_read_only_functions() {
        // Square
        double area = PlaneFigure
                .getArea(Polygon.assign(Rectangle.assign(Square.assign(Square.square(Point.cartesian(), 5)))));
        Assert.assertEquals(25.0, area, 0.001);

        Rectangle r = Square.assign(Square.square());

        Assert.assertEquals(2.0, r.getLength(), 0.001);
        Assert.assertEquals(2.0, r.getWidth(), 0.001);

        // Rectangle
        area = PlaneFigure.getArea(Polygon.assign(Rectangle.assign(Rectangle.rectangle(Point.cartesian(), 10, 30))));

        Assert.assertEquals(300.0, area, 0.001);

        // Circle
        area = PlaneFigure.getArea(Ellipse.assign(Circle.assign(Circle.circle(5, Point.cartesian()))));

        Assert.assertEquals(78.54, area, 0.001);
    }

    @Test
    public void im_prescription_03_subtype_of_is_reflexive() {
        // Square
        Assert.assertTrue(Square.instanceOfSquare(Square.square()));

        // Rectangle
        Assert.assertTrue(Rectangle.instanceOfRectangle(Rectangle.rectangle()));

        // Circle
        Assert.assertTrue(Circle.instanceOfCircle(Circle.circle()));

        // Ellipse
        Assert.assertTrue(Ellipse.instanceOfEllipse(Ellipse.ellipse()));
    }

    @Test
    public void im_prescription_04_subtype_of_is_transitive() {
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

    @Test
    public void im_prescription_05_propert_and_immediate_subtypes_and_supertypes() {
        // See the static assertion in SquareImpl to see that Square is a proper subset of rectangle.
        Assert.assertTrue(Rectangle.instanceOfRectangle(Square.square()));
    }

    @Test
    public void im_prescription_06_scalar_root_and_leaf_types() {
        // PlaneFigure is a root type and Square is not.
        Assert.assertTrue(Alpha.getSubtypes().contains(PlaneFigure.class));
        Assert.assertFalse(Alpha.getSubtypes().contains(Square.class));

        // Square is a leaf type and PlaneFigure is not.
        Assert.assertTrue(Square.getSubtypes().isEmpty());
        Assert.assertFalse(PlaneFigure.getSubtypes().isEmpty());
    }

    @Test
    public void im_prescription_07_disjoint_and_overlapping_types() {
        // Disjoint types
        Point p = Point.cartesian();
        LineSegment l = LineSegment.lineSegment();

        Assert.assertFalse(Point.instanceOfPoint(l));
        Assert.assertFalse(LineSegment.instanceOfLineSegment(p));

        // Overlapping Types
        Circle c = Circle.circle();
        Square s = Square.square();

        Assert.assertTrue(PlaneFigure.instanceOfPlaneFigure(c));
        Assert.assertTrue(PlaneFigure.instanceOfPlaneFigure(s));

        Assert.assertFalse(Circle.instanceOfCircle(s));
        Assert.assertFalse(Square.instanceOfSquare(c));
    }

    @Test
    public void im_prescription_08_common_subtypes_and_supertypes() {

        // Set of types: Ellipse, Circle

        // Circle is common subtype
        Assert.assertTrue(Alpha.isSupertypeOf(Circle.class, Circle.class));
        Assert.assertTrue(Alpha.isSupertypeOf(Ellipse.class, Circle.class));

        // Ellipse and PlaneFigure are common super types
        Assert.assertTrue(Alpha.isSupertypeOf(Ellipse.class, Ellipse.class));
        Assert.assertTrue(Alpha.isSupertypeOf(Ellipse.class, Circle.class));
        Assert.assertTrue(Alpha.isSupertypeOf(PlaneFigure.class, Ellipse.class));
        Assert.assertTrue(Alpha.isSupertypeOf(PlaneFigure.class, Circle.class));

        // Set of types: Circle, Square, Polygon

        // Plane Figure is common supertype.
        Assert.assertTrue(Alpha.isSupertypeOf(PlaneFigure.class, Circle.class));
        Assert.assertTrue(Alpha.isSupertypeOf(PlaneFigure.class, Square.class));
        Assert.assertTrue(Alpha.isSupertypeOf(PlaneFigure.class, Polygon.class));
    }

    @Test
    public void im_prescription_09_model_of_a_scalar_variable() {
        Ellipse e = Ellipse.ellipse();
        Circle c = Circle.circle();
        
        e = Circle.assign(c);
        
        // Declared type of e is Ellipse.
        
        Assert.assertTrue(e instanceof Ellipse);
        Assert.assertEquals(Circle.class, Alpha.getMostSpecificType(e));
    }
}
