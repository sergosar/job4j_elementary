package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datum : data) {
            result = result && (data[0] == datum);
        }
        return result;
    }
}