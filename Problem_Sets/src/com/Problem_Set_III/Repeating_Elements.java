package com.Problem_Set_III;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;







public class Repeating_Elements {
    public List<Integer> findRepeatingElements() {
        int[] array = {4, 3, 2, 7, 8, 2, 3, 1,3,3};  // Example input array
		System.out.println("question(13)----------------------------");

        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(array));
        List<Integer> repeatingElements = new ArrayList<>(); // To store repeating elements
        int n = array.length;

        // Create a boolean array to track visited elements
        boolean[] visited = new boolean[10];  // Assuming elements are between 0 to 9 (adjust size as needed)

        // Traverse the array to find repeating elements
        for (int i = 0; i < n; i++) {
            // If the element is already visited, it's a repeating element
        	if (repeatingElements.contains(array[i])) {
	             continue;
	        }
            if (visited[array[i]]) {
                repeatingElements.add(array[i]);
            } else {
                // Mark the element as visited (first occurrence)
                visited[array[i]] = true;
            }
        }

        return repeatingElements;
    }
    public List<Integer> Finding_Repeating_Elements(){
		int[] arr= {1,2,1,3,2,5,6,5};
		System.out.println(Arrays.toString(arr));
		int n=arr.length;
		
		
		List<Integer> repeated_Lst=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			if (repeated_Lst.contains(arr[i])) {
	             continue;
	        }
			int count=0;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]&&!repeated_Lst.contains(arr[i])) {
					count++;
					
				}
			}
			if(count>=1) {
				repeated_Lst.add(arr[i]);
			}
			
		}
		return repeated_Lst;
		
	}

   
}

