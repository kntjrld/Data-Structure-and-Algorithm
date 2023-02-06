package com.udemy.hashtable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bucketsort {
    public static void main(String[] args) {
        int[] arr = {23,33,44,52,52,56,25,65,75};

        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void bucketSort(int[] input){
        List<Integer>[] buckets = new List[10];

        for(int i=0; i < buckets.length; i++){
            buckets[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < input.length; i++){
            buckets[hash(input[i])].add(input[i]);

        }
        for(List bucket:buckets){
            Collections.sort(bucket);
        }
    }

    private static int hash(int value){
        return value/(int) 10;
    }

}
