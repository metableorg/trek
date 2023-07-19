package org.metable.trek.sandbox;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.circle.Circle;
import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.planefigure.PlaneFigure;
import org.metable.trek.sandbox.type.polygon.Polygon;
import org.metable.trek.sandbox.type.rectangle.Rectangle;
import org.metable.trek.sandbox.type.weight.Weight;

public class TestExamples {

    public static void main(String[] args) {

        // PlaneFigure plane := Circle.circle();
        PlaneFigure plane = Ellipse.assign(Circle.assign(Circle.circle()));

        System.out.println(PlaneFigure.getArea(plane));

        System.out.println("MST: " + Alpha.getMostSpecificType(plane));

        // Circle c2 = treat_as_circle(plane);
        Circle c1 = Circle.treatAsCircle(Ellipse.treatAsEllipse(plane));
        c1 = Circle.treatAsCircle(plane);

        c1 = Circle.treatAsCircle(Ellipse.translate(Circle.assign(c1), 5, 1000));

        System.out.println(c1);

        Weight weight = Weight.pound();
        System.out.println(Alpha.getMostSpecificType(weight));

        Circle c = Circle.circle();
        System.out.println("MST: " + Alpha.getMostSpecificType(c));

        // Ellipse.setA(c, 0);

        // Assignment e := c;
        Ellipse e = Circle.assign(c);
        e.setA(21);
        System.out.println("MST: " + Alpha.getMostSpecificType(e));

        e.setB(21);
        System.out.println("MST: " + Alpha.getMostSpecificType(e));

        c = Circle.treatAsCircle(e);

        c.setR(5);

        System.out.println("MST: " + Alpha.getMostSpecificType(Circle.assign(c)));
        System.out.println("Radius: " + c.getR());

        e = Circle.assign(c);

        System.out.println("A: " + e.getA());
        System.out.println("B: " + e.getB());

        e.setA(6);
        System.out.println("MST: " + Alpha.getMostSpecificType(e));
        System.out.println("A: " + e.getA());
        System.out.println("B: " + e.getB());

        Rectangle r = Rectangle.rectangle();

        plane = Polygon.assign(Rectangle.assign(r));

        System.out.println(PlaneFigure.getArea(plane));
    }

}
