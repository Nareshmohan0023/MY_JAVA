package com.Problem_Set_III;

import java.util.Arrays;

public class MakeArrayEqual {
    public void checkIfEqual() {
        System.out.println("question(22)------------------------------");

        int[] arr = {1, 1, 1, 1, 1}; // Example array
        System.out.println(Arrays.toString(arr));
        
        // Flag to check if all elements are equal
        boolean allEqual = true;
        
        // Compare each element to the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                allEqual = false;
                break;
            }
        }
        
        // Output result
        if (allEqual) {
            System.out.println("Yes, all numbers in the array are equal.");
        } else {
            System.out.println("No, all numbers in the array are not equal.");
        }
    }

    
}
