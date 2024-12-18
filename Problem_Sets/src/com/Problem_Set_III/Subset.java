package com.Problem_Set_III;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Subset {
    public void Subset_or_not() {
        System.out.println("question(21)------------------------------");
        int[] arr1 = {1, 2, 3, 6, 5, 4}; // potential subset
        int[] arr2 = {7, 8, 9, 4, 5, 6, 3, 2, 1}; // superset

        // Determine which array is the superset and which is the subset based on length
        int[] superset = arr1.length > arr2.length ? arr1 : arr2;
        int[] subset = arr1.length > arr2.length ? arr2 : arr1;
        System.out.println(Arrays.toString(superset));
        System.out.println(Arrays.toString(subset));

        // Convert superset array to a Set for efficient lookup
        Set<Integer> set = new HashSet<>();
        for (int num : superset) {
            set.add(num);
        }

        // Check if every element of subset exists in the superset set
        boolean isSubset = true;
        for (int num : subset) {
            if (!set.contains(num)) {
                isSubset = false;
                break; // No need to check further if one element is missing
            }
        }

        // Output the result
        if (isSubset) {
            System.out.println("The array " + (arr1.length > arr2.length ? "arr2" : "arr1") + " is a subset of the other.");
        } else {
            System.out.println("Neither array is a subset of the other.");
        }
    }

}
