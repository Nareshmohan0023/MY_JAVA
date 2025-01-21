package com.Problem_Set_III;

import java.util.Arrays;

public class MinimumSumOfAbsoluteDifference {
    public void findMinSum() {
        // Step 1: Sort the array
    	int[] arr = {4, 1, 8, 7};
        Arrays.sort(arr);

        int minSum = 0;

        // Step 2: Calculate the sum of absolute differences
        for (int i = 0; i < arr.length - 1; i++) {
            minSum += Math.abs(arr[i] - arr[i + 1]);
        }

        return minSum;
    }

    public static void main(String[] args) {
        MinimumSumOfAbsoluteDifference obj = new MinimumSumOfAbsoluteDifference();
        
        
        System.out.println("Minimum Sum of Absolute Differences: " + obj.findMinSum(arr));
    }
}
