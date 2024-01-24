package cz.spsmb.sec.generics.utils;

public class MathUtils {

    public static Double plus(Double a, Double b) {
        return a + b;
    }

    public static Double plus2(Double... a) {
        Double sum = 0d;
        for (Double number : a) {
            sum += number;
        }
        return sum;
    }

    public static Double[] divide(int divideByNumber, Double... numbersToDivide) {
        for (int i = 0; i < numbersToDivide.length; i++) {
            numbersToDivide[i] = numbersToDivide[i] / divideByNumber;
        }
        return numbersToDivide;
    }

    public static <T extends Number, V extends Number> Double plus(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> Number[] divide2(T divideByNumber, V... numbersToDivide) {
        Number[] result = new Number[numbersToDivide.length];
        for (int i = 0; i < numbersToDivide.length; i++) {
            result[i] = numbersToDivide[i].doubleValue() / divideByNumber.doubleValue();
        }
        return numbersToDivide;
    }
}
