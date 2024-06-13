package src.BigDecimalOperations;
//Author: Carlos J. Pepin Delgado <carlos.pepin1@upr.edu>

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        System.out.println(roundNearestHundredth(new BigDecimal("4.2545")));

        System.out.println(reverseSign(new BigDecimal("1.2345")));
        System.out.println(reverseSign(new BigDecimal("-45.67")));
    }
    public static double roundNearestHundredth(BigDecimal bdn){
        return bdn.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static BigDecimal reverseSign(BigDecimal bdn){
        return bdn.negate().setScale(1, RoundingMode.HALF_UP);
    }


}
