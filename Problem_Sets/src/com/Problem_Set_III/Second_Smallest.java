package com.Problem_Set_III;

import java.util.Arrays;

public class Second_Smallest {
	public int Find_Scnd_Small() {
		System.out.println("question(4)----------------------------");
		

		int[] arr= {10,9,81,1,4,11,3,89};
		int First=Integer.MAX_VALUE;
		int Second=Integer.MAX_VALUE;
		System.out.println(Arrays.toString(arr));
		System.out.println("the second largest element is:");
		//for(int el:arr){}
		if(arr.length>2) {
			for(int i=0;i<arr.length;i++) {
				if (arr[i]<First) {
					Second=First;
					First=arr[i];
				}
				else if(arr[i]>First&&arr[i]<Second) {
					Second=arr[i];
				}
			}
			return Second;
		}
		else {
			System.out.println("There is less than 2 element in an array");
			return -1;
		}
		
	
	}

}