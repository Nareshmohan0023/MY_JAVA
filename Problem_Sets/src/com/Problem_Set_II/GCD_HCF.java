package com.Problem_Set_II;

public class GCD_HCF {
	public int Find_Gcd(int a ,int b) {
		System.out.println("----------------------------");
		System.out.println("The Gcd between "+a+" and "+b+" is :");
		int temp;    
		while(b!=0) {
			temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}

}
