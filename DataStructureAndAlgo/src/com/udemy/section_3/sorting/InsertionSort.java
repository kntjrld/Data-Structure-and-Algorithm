package com.udemy.section_3.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3,23,-32,-2,-4,23,2};
        for(int i = 1; i<arr.length; i++){
            int x = arr[i];
            int a;
            for(a = i; a > 0 && arr[a - 1] > a; a--){
                arr[a] = arr[a - 1];
            }
            arr[a] = x;
        }
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
