package com.Problem_Set_III;

import java.util.Arrays;

public class Smallest_El_Array {
	public int Find_Smallest() {
		System.out.println("question(2)----------------------------");
		int[] arr= {5,6,12,3,4,9,10};
//		int[] arr1;
//		int[] arr2=new int[5];
		int temp=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<temp) {
				temp=arr[i];
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("The Smallest element among the array is");
		return temp;
	
	}

}
