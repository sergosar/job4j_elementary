package ru.job4j.loop;

import java.time.Year;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        while (amount * (1 + percent / 100) > salary) {
            year++;
            amount = amount * (1 + percent / 100) - salary;
        }
        return year;
    }
}