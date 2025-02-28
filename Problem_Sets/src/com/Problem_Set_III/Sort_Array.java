package com.Problem_Set_III;

public class Sort_Array {
    public static void Sort() {
    	System.out.println();
    	System.out.println("question(7)----------------------------");
    	
        // Example array
        int[] array = {5, 2, 9, 1, 5, 6};

        // Display the original array
        System.out.print("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sort the array
        bubbleSort(array);

        // Display the sorted array
        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

