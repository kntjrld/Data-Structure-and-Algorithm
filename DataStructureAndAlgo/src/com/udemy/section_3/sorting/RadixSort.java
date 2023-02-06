package com.udemy.section_3.sorting;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {3323,3442, 4343,4232,2340};
        radixSort(arr, 10, 4);

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void radixSort(int[] input, int radix, int width){
        for(int i = 0; i<width; i++){
            radixSingleSort(input,i, radix);
        }
    }
    public static void radixSingleSort(int[] input, int position, int radix){
        int numItems = input.length;
        int[] countArray = new int[radix];

        for(int value : input){
            countArray[getDigit(position, value, radix)]++;
        }

//        Adjust the count array
        for(int j = 1; j<radix; j++){
            countArray[j] += countArray[j-1];
        }
        int[] temp = new int[numItems];
        for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] =
                    input[tempIndex];
        }
        for(int tempIndex = 0; tempIndex < numItems; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }
    }

    private static int getDigit(int position, int value, int radix) {
    return value / (int) Math.pow(10, position)  % radix;
    }
}
