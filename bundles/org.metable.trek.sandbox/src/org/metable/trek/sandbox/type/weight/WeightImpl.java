package org.metable.trek.sandbox.type.weight;

public class WeightImpl implements Weight {

    static class Gram {
        static boolean constraint(Gram gram) {
            return gram.g >= 0.0;
        }

        double g;

        Gram(double g) {
            this.g = g;
            assert (constraint(this));
        }

        Gram(Kilogram kilogram) {
            g = 0.00220462 * kilogram.kg;
            assert (constraint(this));
        }

        Gram(Pound pound) {
            g = 2.20462 * pound.lb;
            assert (constraint(this));
        }
    }

    static class Kilogram {
        static boolean constraint(Kilogram kilogram) {
            return kilogram.kg >= 0.0;
        }

        final double kg;

        Kilogram(double kg) {
            this.kg = kg;
            assert (constraint(this));
        }

        Kilogram(Gram gram) {
            kg = 0.00220462 * gram.g;
            assert (constraint(this));
        }

        Kilogram(Pound pound) {
            kg = 2.20462 * pound.lb;
            assert (constraint(this));
        }
    }

    static class Pound {

        static boolean constraint(Pound pound) {
            return pound.lb >= 0.0;
        }

        final double lb;

        Pound(double lb) {
            this.lb = lb;
            assert (constraint(this));
        }

        Pound(Gram gram) {
            lb = 0.00220462 * gram.g;
            assert (constraint(this));
        }

        Pound(Kilogram kilogram) {
            lb = 2.20462 * kilogram.kg;
            assert (constraint(this));
        }
    }

    Pound pound;
    Kilogram kilogram;
    Gram gram;

    WeightImpl() {
    }

    @Override
    public double getG() {
        return gram.g;
    }

    @Override
    public double getKg() {
        return kilogram.kg;
    }

    @Override
    public double getLb() {
        return pound.lb;
    }

    @Override
    public void setG(double g) {
        gram = new Gram(g);
        kilogram = new Kilogram(gram);
        pound = new Pound(gram);
    }

    @Override
    public void setKg(double kg) {
        kilogram = new Kilogram(kg);
        pound = new Pound(kilogram);
        gram = new Gram(kilogram);
    }

    @Override
    public void setLb(double lb) {
        pound = new Pound(lb);
        kilogram = new Kilogram(pound);
        gram = new Gram(pound);
    }
}
