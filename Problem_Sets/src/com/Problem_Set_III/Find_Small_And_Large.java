package com.Problem_Set_III;

import java.util.Arrays;

public class Find_Small_And_Large {
	public int Find_Smallest(int[] arr) {
		int temp=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<temp) {
				temp=arr[i];
			}
			
		}
		return temp;
	}
	public int Find_Largest(int[] arr) {
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(temp<arr[i]) {
				temp=arr[i];
			}
			
		}
		return temp;
	}
	public void Find_S_and_L() {
		System.out.println("question(3)----------------------------");
		int[] arr= {5,6,12,3,4,9,10};
		int smallest=Find_Smallest(arr);
		int largest=Find_Largest(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("The Smallest element among the array is "+smallest);
		System.out.println("The largest element among the array is "+largest);
		
	}

}
