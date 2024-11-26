package com.Problem_Set_I;

public class Perfect_Number {
	public String Is_perfect_number(int n) {
   	 	System.out.println("--------------------------------");  

		System.out.println("the number is :"+n);
		if(n<0) {
			return "It is not a perfect number";
		}
		
		int sum=0;
		for (int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			return "Perfect Number";
		}
		else {
			return "Not a Perfect number";
		}
	}

}
