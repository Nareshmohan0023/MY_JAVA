package com.Problem_Set_III;

import java.util.Arrays;

public class Largest_El_Array {
	public static int Find_Largest() {
		System.out.println("question(1)----------------------------");
		int[] arr= {5,6,12,3,4,9,10};
//		int[] arr1;
//		int[] arr2=new int[5];
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("The largest element among the array is");
		return temp;
	}

}