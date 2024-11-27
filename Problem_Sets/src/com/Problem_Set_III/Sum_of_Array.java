package com.Problem_Set_III;

import java.util.Arrays;

public class Sum_of_Array {
	public int Sum_All_El() {
		System.out.println("question(5)----------------------------");
		System.out.println("The sum of the elements in the array");
		int[] arr= {5,6,12,3,4,9,10};
		int sum=0;
		for(int El:arr) {
			sum+=El;
		}
		System.out.println(Arrays.toString(arr));
		return sum;
	}
}
