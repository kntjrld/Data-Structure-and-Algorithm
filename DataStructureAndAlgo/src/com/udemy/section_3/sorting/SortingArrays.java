package com.udemy.section_3.sorting;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] arr = {23,3,3,535,3,2,53,35};
        String[] str = {"hsdj","ajwe","xnad", "dwcs"};

        Arrays.stream(arr).sorted().forEach(System.out::println);

    }
}
