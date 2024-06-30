package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int resultAdd = add(1, 2);
        System.out.println("1 + 2 = " + resultAdd);

        int resultDiv = divide(6, 2);
        System.out.println("6 / 2 = " + resultDiv);

        int resultSub = subtract(5, 2);
        System.out.println("5 - 2 = " + resultSub);

        int resultMul = multiply(4, 2);
        System.out.println("4 * 2 = " + resultMul);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}