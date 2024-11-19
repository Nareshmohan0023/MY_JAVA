package com.Problem_Set_I;

public class Reverse_of_number {
	public void Reverse(int n) {
		System.out.println("--------------------------------");
		int reversed=0;
		System.out.println("the number is "+n);
		while(n!=0) {
			reversed=reversed*10+(n%10);
			n=n/10;
		}
		System.out.println("the reversed number is: "+reversed );
	}
}
