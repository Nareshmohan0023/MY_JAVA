package com.Problem_Set_I;

public class Perfect_Square {
	public String Is_perfect_square(int n) {
		System.out.println("--------------------------------");  

		System.out.println("the number is :"+n);
		if(n<0) {
			return "Not a perfect square";
		}
		int sqrt=(int)Math.sqrt(n);
		int i=sqrt*sqrt;
		if(n==i) {
			return "Perfect Square";
		}
		else {
			return "Not a perfect Square";
		}
	}

}
