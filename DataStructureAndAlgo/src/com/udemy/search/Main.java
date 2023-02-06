package com.udemy.search;

public class Main {
    public static void main(String[] args) {

        int[] x = {23,3,24,32,42,22};
        System.out.println(linearSearch(x, -15));
        System.out.println(linearSearch(x, 1));
        System.out.println(linearSearch(x, 8888));
        System.out.println(linearSearch(x, -22));
}

    public static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }

        return -1;
    }
}
