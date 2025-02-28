package com.Problem_Set_III;

public class Reverse_An_Array {
    public static void Reverse() {
		System.out.println("question(6)----------------------------");

        int[] array = {1, 2, 3, 4, 5};
        
        System.out.print("Original Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        reverseArray(array);

        // Display reversed array manually
        System.out.print("Reversed Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            
            start++;
            end--;
        }
    }
}

