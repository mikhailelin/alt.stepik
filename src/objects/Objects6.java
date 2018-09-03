package objects;

import java.math.BigInteger;

public class Objects6 {
    public static boolean atLeastTwoAreEqual(BigInteger num1, BigInteger num2, BigInteger num3) {
        return (num1.equals(num2)) || (num2.equals(num3))|| (num1.equals(num3));
    }
}
