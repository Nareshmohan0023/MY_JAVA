package com.Problem_Set_III;

import java.util.Arrays;

public class Scarlar_Product_of_Two_vector {
	public int Product() {
		System.out.println("question(15)----------------------------");

//		sorting x as ascending and y as descending
		int[] x= {1,8,4};//148
		int[] y= {5,4,7};//754
		Arrays.sort(x);
		Arrays.sort(y);
		int Start=0;
		int End=y.length-1;
		int sum=0;
		while(Start<End) {
			int temp=0;
			temp=y[Start];
			y[Start]=y[End];
			y[End]=temp;
			
			
			Start++;
			End--;
		}
		
		for(int i=0;i<y.length;i++) {
			sum+=x[i]*y[i];
		}
		return sum;
	}
}