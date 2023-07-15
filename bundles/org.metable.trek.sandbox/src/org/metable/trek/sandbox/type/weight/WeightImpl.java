package org.metable.trek.sandbox.type.weight;

public class WeightImpl implements Weight {

    static class Gram {
        static boolean constraint(Gram gram) {
            return gram.g >= 0.0;
        }

        double g;

        Gram(double g) {
            this.g = g;
        }

        Gram(Kilogram kilogram) {
            g = 0.00220462 * kilogram.kg;
        }

        Gram(Pound pound) {
            g = 2.20462 * pound.lb;
        }
    }

    static class Kilogram {
        static boolean constraint(Kilogram kilogram) {
            return kilogram.kg >= 0.0;
        }

        final double kg;

        Kilogram(double kg) {
            this.kg = kg;
        }

        Kilogram(Gram gram) {
            kg = 0.00220462 * gram.g;
        }

        Kilogram(Pound pound) {
            kg = 2.20462 * pound.lb;
        }
    }

    static class Pound {

        static boolean constraint(Pound pound) {
            return pound.lb >= 0.0;
        }

        final double lb;

        Pound(double lb) {
            this.lb = lb;
        }

        Pound(Gram gram) {
            lb = 0.00220462 * gram.g;
        }

        Pound(Kilogram kilogram) {
            lb = 2.20462 * kilogram.kg;
        }
    }

    Pound pound;
    Kilogram kilogram;
    Gram gram;

    WeightImpl() {
    }

    void setG(double g) {
        gram = new Gram(g);
        assert (Gram.constraint(gram));

        kilogram = new Kilogram(gram);
        pound = new Pound(gram);
    }

    void setKg(double kg) {
        kilogram = new Kilogram(kg);
        assert (Kilogram.constraint(kilogram));

        pound = new Pound(kilogram);
        gram = new Gram(kilogram);
    }

    void setLb(double lb) {
        pound = new Pound(lb);
        assert (Pound.constraint(pound));

        kilogram = new Kilogram(pound);
        gram = new Gram(pound);
    }

    double getG() {
        return gram.g;
    }
}
