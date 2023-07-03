/**
 * <code> 
 *  // Example using possible representations (rep) to perform unit conversion. 
 *  
 *  type Weight {
 *      
 *      rep Pound {
 *          double lb;
 *          
 *          constraint {
 *              lb >= 0.0;
 *          }
 *      }
 *      
 *      rep Kilogram {
 *          double kg;
 *          
 *          constraint {
 *              kg >= 0.0;
 *          }
 *      }
 *      
 *      rep Gram {
 *          double g;
 *          
 *          constraint {
 *              g >= 0.0;
 *          }
 *      }
 *      
 *      // Show how to translate between possible representations.
 *      
 *      Pound from Kilogram {
 *          lb = 2.20462 * kg;
 *      } 
 *      
 *      Pound from Gram {
 *          lb = 0.00220462 * g;
 *      } 
 *      
 *      Kilogram from Pound {
 *          kg = 0.453592 * lb;
 *      }
 *      
 *      Kilogram from Gram {
 *          kg = 0.001 * g;
 *      }
 *      
 *      Gram from Pound {
 *          g = 453.592 * lb;
 *      }
 *      
 *      Gram from Kilogram {
 *          g = 1000 * kg;
 *      }
 *     
 *      init {
 *          Pound(0);
 *      }
 *  }
 *     
 *  </code>
 */

package org.metable.trek.sandbox.type.weight;

import java.util.Collections;
import java.util.List;

import org.metable.trek.sandbox.type.Alpha;

public interface Weight extends Alpha {

    public static Weight pound(double lb) {
        WeightImpl weight = new WeightImpl();

        weight.pound = new WeightImpl.Pound(lb);
        weight.kilogram = new WeightImpl.Kilogram(weight.pound);
        weight.gram = new WeightImpl.Gram(weight.pound);

        return weight;
    }

    public static Weight pound() {
        return pound(0.0);
    }

    void setLb(double lb);

    void setKg(double kg);

    void setG(double g);

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
    }

    public static boolean isType(Alpha alpha) {
        return (alpha instanceof Weight);
    }
}
