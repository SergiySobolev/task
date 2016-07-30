package cosi.util;

import org.springframework.util.Assert;

public class CalcUtil {
    public static Double calc(Double x1, Double x2) {
        Assert.isTrue(x1 != 0, "x1 shouldn't be equal 0");
        return x1 + 5*x2/x1;
    }
}
