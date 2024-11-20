package com.Problem_Set_I;

public class Abundant_number {
	public String Is_Abundant_Number(int n) {
		System.out.println("--------------------------------");  
		System.out.println("the number is :"+n);
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if (n%i==0) {
				sum+=i;
			}
		}
		if(sum>n) {
			return "It is Abundant_number";
		}
		else {
			return "Not a abundant number";
		}
		
	}

}
