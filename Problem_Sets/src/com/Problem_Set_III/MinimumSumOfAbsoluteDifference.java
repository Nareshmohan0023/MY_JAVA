package com.Problem_Set_III;

import java.util.Arrays;

public class MinimumSumOfAbsoluteDifference {
    public void findMinSum() {
        System.out.println("question(23)------------------------------");

    	int[] arr = {4, 1, 8, 7};
        Arrays.sort(arr);

        int minSum = 0;

        // Step 2: Calculate the sum of absolute differences
        for (int i = 0; i < arr.length - 1; i++) {
            minSum += Math.abs(arr[i] - arr[i + 1]);
        }

        
        System.out.println("Minimum Sum of Absolute Differences: " +minSum);
        
    }

  
}


//12345=>