package com.Problem_Set_III;

import java.util.Arrays;

public class Disjoint_Or_Not {
	public String find() {
		System.out.println("question(20)------------------------------");
		

		int[] arr1= {1,2,3,4,5};
		int[] arr2= {6,7,8,9,10,1};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		for (int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					return "It is not disjoint";
				}
			}
		}
		return "It is Disjoint";
	}

}
