package org.metable.trek.sandbox.type.circle;

import org.metable.trek.sandbox.type.elipse.Ellipse;

public class TestCircle {

    public static void main(String[] args) {
        Circle circle = Circle.circle();

        System.out.println("MST: " + circle.getMostSpecificType());

        circle.setA(3);
        circle.setB(4);

        System.out.println("MST: " + circle.getMostSpecificType());

        circle.setB(3);

        System.out.println("MST: " + circle.getMostSpecificType());

        Ellipse ellipse = Ellipse.ellipse();

        System.out.println("MST: " + ellipse.getMostSpecificType());
        
        ellipse.setA(5);
        ellipse.setB(5);

        System.out.println("MST: " + ellipse.getMostSpecificType());
    }

}
