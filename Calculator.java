package com.tts;

public class Calculator {

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(int num1, int num2) {
        return (double) num1 / (double) num2;
    }

    public static double square(int num1, int num2) {
        double num1mod = (double) num1;
        double num2mod = (double) num2;

        return Math.pow(num1mod, num2mod);
    }
}
