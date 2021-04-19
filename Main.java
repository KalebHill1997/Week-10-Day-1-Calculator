package com.tts;

public class Main {
    public static void main(String[] args) {
        System.out.println("add : " + Calculator.add(5, 2));
        System.out.println("subtract : " + Calculator.subtract(5, 2));
        System.out.println("multiply : " + Calculator.multiplication(5, 2));
        System.out.println("divide: " + Calculator.division(5, 2));
        System.out.println("square root: " + MagicCalculator.squareRoot(4));
        System.out.println("sine: " + MagicCalculator.sin(5));
        System.out.println("cosine: " + MagicCalculator.cosine(5));
        System.out.println("tangent: " + MagicCalculator.tangent(5));
        System.out.println("recursive factorial: " + MagicCalculator.factorial(5));
        System.out.println("inheriting add : " + MagicCalculator.add(8, 8));
    }
}
