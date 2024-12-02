package com.Problem_Set_III;

public class MaximumProductSubarray {
    public int maxProduct() {
		System.out.println("question(19)------------------------------");

    	 int[] arr = {2, 3, -2, 4, -1};
        if (arr.length == 0) return 0;
       


        int maxProduct = arr[0];  // Initialize maxProduct to the first element
        int minProduct = arr[0];  // Initialize minProduct to the first element
        int result = arr[0];      // To store the final result
        System.out.println("Maximum product of subarray is: " );
        for (int i = 1; i < arr.length; i++) {
            // If the current element is negative, we swap maxProduct and minProduct
            if (arr[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update the maxProduct and minProduct
            maxProduct = Math.max(arr[i], maxProduct * arr[i]);
            minProduct = Math.min(arr[i], minProduct * arr[i]);

            // Update the result
            
            result = Math.max(result, maxProduct);
        }

        return result;
    }


}

