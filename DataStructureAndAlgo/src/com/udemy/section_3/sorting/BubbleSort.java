package com.udemy.section_3.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {32,-23,-2,32,20,30};
//      sorting using simple way
        System.out.println("Simple sorting");
        Arrays.stream(arr).sorted().forEach(System.out::println);
//       sorting using methods ==> manual
        System.out.println("Manual sorting");
        for(int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i< lastUnsortedIndex; i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1 );
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if(i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
