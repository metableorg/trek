package org.metable.trek.sandbox.type.circle;

import org.metable.trek.sandbox.type.elipse.Ellipse;
import org.metable.trek.sandbox.type.weight.Weight;

public class TestCircle {

    public static void main(String[] args) {
        Weight weight = Weight.pound();

        System.out.println(weight.getMostSpecificType());

        Circle circle = Circle.circle();
        
        System.out.println(circle.getMostSpecificType());

        System.out.println("MST: " + circle.getMostSpecificType());

        circle.setA(11);
        circle.setB(3);

        System.out.println("MST: " + circle.getMostSpecificType());

        circle.setB(11);

        System.out.println("MST: " + circle.getMostSpecificType());

        Ellipse ellipse = Ellipse.ellipse();

        System.out.println("MST: " + ellipse.getMostSpecificType());
        
        ellipse.setA(5);
        ellipse.setB(5);

        System.out.println("MST: " + ellipse.getMostSpecificType());
    }

}
