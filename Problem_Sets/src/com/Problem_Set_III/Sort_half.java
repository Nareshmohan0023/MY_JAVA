package com.Problem_Set_III;


import java.util.Arrays;

public class Sort_half {
	static int x=5;
    public static void sort_half() {
    	
    	System.out.println();
    	System.out.println("question(8)----------------------------");
    	int[] array = {7, 2, 9, 4, 3, 8, 1, 6};
        
        System.out.println("Original Array: " + Arrays.toString(array));
        
        // Sort the first half in ascending order
        int n = array.length;
        int mid = n / 2;
        Arrays.sort(array, 0, mid);

        // Sort the second half in ascending order first
        Arrays.sort(array, mid, n);

        // Reverse the second half to make it descending
        int start = mid;
        int end = n - 1;

        while (start < end) {
            // Swap the elements at indices start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move pointers closer
            start++;
            end--;
        }

        // Output the modified array
        System.out.println("Modified Array: " + Arrays.toString(array));
    }
}
