package com.tts;

public class MagicCalculator extends Calculator{
    public static double squareRoot(int num1) {
        return Math.sqrt(num1);
    }

    public static double sin(int num1) {
        return Math.sin(num1);
    }

    public static double cosine(int num1) {
        return Math.cos(num1);
    }

    public static double tangent(int num1) {
        return Math.tan(num1);
    }

    public static int factorial(int num1) {
        if(num1 == 0) {
            return 1;
        }
        return num1 * factorial(num1 - 1);
    }
}
