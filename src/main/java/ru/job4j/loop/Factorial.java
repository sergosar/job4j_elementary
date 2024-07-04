package ru.job4j.loop;

public class Factorial {
    public static int calculate(int number) {
        int res = 1;
        for (int i = 2; i <= number; i++) {
            res *= i;
        }
        return res;
    }
}