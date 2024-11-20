package com.Problem_Set_I;

public class Harshad_Number {
	public String Is_Harsad_Number(int n) {
		System.out.println("--------------------------------");  

		System.out.println("the number is :"+n);
		int org_num=n;
		if(n<0) {
			return "Not a Harsad Number";
		}
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n=n/10;
		}
		if(org_num%sum==0) {
			return "Harsad Number";
		}
		else {
			return  "Not a Harsad Number";
		}
	}

}
