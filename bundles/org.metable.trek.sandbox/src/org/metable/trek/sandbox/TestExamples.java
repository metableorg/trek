package org.metable.trek.sandbox;

import org.metable.trek.sandbox.type.Alpha;
import org.metable.trek.sandbox.type.circle.Circle;
import org.metable.trek.sandbox.type.ellipse.Ellipse;
import org.metable.trek.sandbox.type.weight.Weight;

public class TestExamples {

    public static void main(String[] args) {
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

//
//        // Type coercion c = treat_as_circle(e);
//        c = Circle.circle(e);
//        System.out.println("MST: " + c.getMostSpecificType());
//
//        System.out.println(c.getMostSpecificType());
//
//        System.out.println("MST: " + c.getMostSpecificType());
//
//        c.setA(11);
//        c.setB(3);
//
//        System.out.println("MST: " + c.getMostSpecificType());
//
//        c.setB(11);
//
//        System.out.println("MST: " + c.getMostSpecificType());
//
//        Ellipse ellipse = Ellipse.ellipse();
//
//        System.out.println("MST: " + ellipse.getMostSpecificType());
//
//        ellipse.setA(5);
//        ellipse.setB(5);
//
//        System.out.println("MST: " + ellipse.getMostSpecificType());
    }

}
