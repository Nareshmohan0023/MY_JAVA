package com.Problem_Set_IV;

import java.util.Arrays;

public class SortArrayWithoutAlgorithm {
    public  void find() {
    	System.out.println("Q(1)---------------------------");
        int[] arr = {0, 2, 1, 2, 0, 1, 2, 0, 1};

        

        System.out.println( Arrays.toString(arr));
   
        int count0 = 0, count1 = 0, count2 = 0;

        for (int num : arr) {
            switch (num) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }

        // Refill the array with sorted values
        int index = 0;

        // Add 0s
        while (count0-- > 0) {
            arr[index++] = 0;
        }

        // Add 1s
        while (count1-- > 0) {
            arr[index++] = 1;
        }

        // Add 2s
        while (count2-- > 0) {
            arr[index++] = 2;
        }
        
        System.out.println("Sorted array : "+ Arrays.toString(arr));
    }
}

