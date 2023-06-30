package org.metable.trek.sandbox.type.weight;

/**
 * <code> 
 * 
 *  type Weight {
 *      rep Pound {double lb; constraint {lb >= 0;}}
 *      rep Kilogram {double kg; constraint {kg >= 0;}}
 *      rep Gram {double value; constraint {g >= 0;}}
 *      
 *      Pound {Kilogram {lb = 2.20462 * kg;}} 
 *      Pound {Gram {lb = 0.00220462 * g;}} 
 *      
 *      Kilogram {Pound {kg = 0.453592 * lb;}}
 *      Kilogram {Gram {kg = 0.001 * g;}}
 *      
 *      Gram {Pound {g = 453.592 * lb;}}
 *      Gram {Kilogram {g = 1000 * kg;}}
 *     
 *      init {Pound(0);}
 *  }
 *     
 *	</code>
 */
public class Weight {

    private static class Pound {

        private double value;

        private static boolean constraint(double value) {
            return value >= 0;
        }

        private Pound(double value) {
            assert (constraint(value));

            this.value = value;
        }

        private Pound(Kilogram kilogram) {
            value = 2.20462 * kilogram.value;
        }

        private Pound(Gram gram) {
            value = 0.00220462 * gram.value;
        }

        private void setValue(double value) {
            this.value = value;
        }
    }

    private static class Kilogram {
        private double value;

        private static boolean constraint(double value) {
            return value >= 0;
        }

        private Kilogram(double value) {
            assert (constraint(value));

            this.value = value;
        }

        private Kilogram(Pound pound) {
            value = 2.20462 * pound.value;
        }

        private Kilogram(Gram gram) {
            value = 0.00220462 * gram.value;
        }
    }

    private static class Gram {
        private double value;

        private static boolean constraint(double value) {
            return value >= 0;
        }

        private Gram(double value) {
            assert (constraint(value));

            this.value = value;
        }

        private Gram(Pound pound) {
            value = 2.20462 * pound.value;
        }

        private Gram(Kilogram kilogram) {
            value = 0.00220462 * kilogram.value;
        }
    }

    private Pound pound;
    private Kilogram kilogram;
    private Gram gram;

    public static Weight pound(double value) {
        Weight weight = new Weight();

        weight.pound = new Pound(value);
        weight.kilogram = new Kilogram(weight.pound);
        weight.gram = new Gram(weight.pound);

        return weight;
    }

    public void setPoundValue(double value) {
        pound.setValue(value);
        kilogram = new Kilogram(pound);
        gram = new Gram(pound);
    }

}
