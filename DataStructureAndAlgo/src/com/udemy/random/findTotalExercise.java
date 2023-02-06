package com.udemy.random;


public class findTotalExercise {
    public static int findTotal(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            if(arr[i]%2 == 0){
                sum +=2;
            }else if(arr[i]%2 == 1){
                sum +=5;
            }
            return sum;
    }



    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 2, 5, 7};
//        System.out.println(findTotal(arr));
//
//       for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        BubbleSort(arr);
//        for (int a : arr){
//            System.out.println(a);
//        }

//        sum of all array
//        System.out.println("sum of all array");
//        System.out.println(SumOfArray(arr));
//        int l = 8;
//        for(int a = 0; a<=l; a++){
//            for(int b = 0; b<=a; b++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        }

    public static void BubbleSort(int[] arr){
        int arr_length = arr.length;
        for(int i = 0; i < arr_length - 1; i++){
            for(int j = 0; j < arr_length - i - 1; j++){
//                24,22
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j]; //24
                    arr[j] = arr[j+1]; //22
                    arr[j+1] = temp; //24
                }
            }
        }
    }
    public static int SumOfArray(int[] num){
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }
        return sum;
    }
}
