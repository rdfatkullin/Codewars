package zeroOrInf;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ZeroOrInf {

    static BigDecimal zeroPart;
    static BigDecimal infPart;
    static BigDecimal multy;

    public static double going(int n) {
        infPart = BigDecimal.ZERO;
        zeroPart = BigDecimal.ONE;
        multy = BigDecimal.ONE;

        //Calculating infinite part of the equation
        for (int i = 1; i < n+1; i++) {
            multy = multy.multiply(BigDecimal.valueOf(i));
            infPart = infPart.add(multy);
        }

        System.out.println("ip is" + infPart);
        System.out.println("n! is" + multy);

        //Calculating zero part of the equation
        zeroPart = BigDecimal.ONE.divide(multy, MathContext.DECIMAL128);

        double d = infPart.multiply(zeroPart).doubleValue();
        DecimalFormat format = new DecimalFormat("0.######");
        format.setRoundingMode(RoundingMode.DOWN);
        return Double.parseDouble(format.format(d).replaceAll(",", "."));
    }
}
