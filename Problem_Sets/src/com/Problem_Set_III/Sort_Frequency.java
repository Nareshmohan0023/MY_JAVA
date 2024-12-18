package com.Problem_Set_III;


public class Sort_Frequency {
    public  void Sort_by_frequency() {
    	System.out.println();
    	System.out.println("question(10)----------------------------");
	    
        int[] array = {2, 3, 2, 3, 5, 6, 3};

        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call the function to sort by frequency
        int[] sortedArray = sortElementsByFrequency(array);

        // Print the sorted array
        System.out.println("Array Sorted by Frequency:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortElementsByFrequency(int[] array) {
        int n = array.length;

        int[] unique = new int[n];   // Array to store unique elements
        int[] frequency = new int[n]; // Array to store corresponding frequencies
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            // Check if the element is already in the unique array
            boolean found = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == array[i]) {
                    frequency[j]++; // Increment frequency if found
                    found = true;
                    break;
                }
            }

            // If not found, add it to the unique array
            if (!found) {
                unique[uniqueCount] = array[i];
                frequency[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // Step 2: Sort the unique elements by frequency (descending) and value (ascending)
        for (int i = 0; i < uniqueCount-1 ; i++) {
            for (int j = i + 1; j < uniqueCount; j++) {
                // Compare by frequency, then by value
                if (frequency[i] < frequency[j] ||
                   (frequency[i] == frequency[j] && unique[i] > unique[j])) {
                    // Swap frequencies
                    int tempFreq = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = tempFreq;

                    // Swap unique elements
                    int tempVal = unique[i];
                    unique[i] = unique[j];
                    unique[j] = tempVal;
                }
            }
        }

        // Step 3: Rebuild the array based on sorted frequencies
        int[] result = new int[n];
        int index = 0;
        for (int i = 0; i < uniqueCount; i++) {
            for (int j = 0; j < frequency[i]; j++) {
                result[index++] = unique[i];
            }
        }

        return result;
    }
}
