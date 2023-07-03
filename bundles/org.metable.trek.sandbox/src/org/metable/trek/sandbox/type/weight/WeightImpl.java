package org.metable.trek.sandbox.type.weight;

public class WeightImpl implements Weight {

    static class Pound {

        final double lb;

        static boolean constraint(double lb) {
            return lb >= 0.0;
        }

        Pound(double lb) {
            this.lb = lb;
        }

        Pound(Kilogram kilogram) {
            lb = 2.20462 * kilogram.kg;
        }

        Pound(Gram gram) {
            lb = 0.00220462 * gram.g;
        }
    }

    static class Kilogram {
        final double kg;

        static boolean constraint(double kg) {
            return kg >= 0.0;
        }

        Kilogram(double kg) {
            this.kg = kg;
        }

        Kilogram(Pound pound) {
            kg = 2.20462 * pound.lb;
        }

        Kilogram(Gram gram) {
            kg = 0.00220462 * gram.g;
        }
    }

    static class Gram {
        double g;

        static boolean constraint(double g) {
            return g >= 0.0;
        }

        Gram(double g) {
            this.g = g;
        }

        Gram(Pound pound) {
            g = 2.20462 * pound.lb;
        }

        Gram(Kilogram kilogram) {
            g = 0.00220462 * kilogram.kg;
        }
    }

    Pound pound;
    Kilogram kilogram;
    Gram gram;

    WeightImpl() {
    }

    @Override
    public void setLb(double lb) {
        pound = new Pound(lb);
        kilogram = new Kilogram(pound);
        gram = new Gram(pound);
    }

    @Override
    public void setKg(double kg) {
        kilogram = new Kilogram(kg);
        pound = new Pound(kilogram);
        gram = new Gram(kilogram);
    }

    @Override
    public void setG(double g) {
        gram = new Gram(g);
        kilogram = new Kilogram(gram);
        pound = new Pound(gram);
    }
}
