package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("ages.length = " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("surnames.length = " + surnames.length);
        float[] prices = new float[40];
        System.out.println("prices.length = " + prices.length);

        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Vladimir Putin";
        names[2] = "Vladimir Zhirinovsky";
        names[3] = "Oleg Gazmanov";
        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
