package com.Problem_Set_III;

import java.util.Arrays;

public class CircularRotation {
    public  void Change() {
    	System.out.println("(Q-24)------------------------------");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int k = 2; // Number of positions to rotate
        System.out.println("Rotation= "+k);

        int[] rotatedArray = circularRotate(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }

    public static int[] circularRotate(int[] arr, int k) {
        int n = arr.length;

        // Normalize k to avoid extra rotations
        k = k % n;

        // Split and merge the array
        int[] part1 = Arrays.copyOfRange(arr, n - k, n); // Last k elements
        int[] part2 = Arrays.copyOfRange(arr, 0, n - k); // First n-k elements

        // Combine parts
        int[] result = new int[n];
        System.arraycopy(part1, 0, result, 0, k); // Copy part1
        System.arraycopy(part2, 0, result, k, n - k); // Copy part2

        return result;
    }
}

