package com.Problem_Set_I;

public class Greatest_of_three {
	public Integer GOT_3(int a,int b,int c) {
		System.out.println("--------------------------------");

		System.out.println("The greates number among 3 is :");
		if (a>b && a>c) {
			return a;
		}
		else if(b>a && b>c) {
			return b;
		}
		else {
			return c;
		}
	}

}
