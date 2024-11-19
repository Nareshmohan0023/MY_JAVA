package com.Problem_Set_I;

public class Armstrong_number {
	public String Find_Armstrong(int n) {
		System.out.println("--------------------------------");
		System.out.println("The number is : "+n);
		int orginal=n;
		int sum=0;
		int digits;
		digits=String.valueOf(n).length();
		while(n!=0) {
			sum+=Math.pow((n%10),digits);
			n=n/10;
		}
		if(orginal==sum) {
			return "It is a armstrong number";
		}
		else {
			return "Not a Armstrong number";
		}
		
	}

}