package com.Problem_Set_II;

public class LCM  {
	public int GCD(int a,int b) {
		int temp;
		while(b!=0) {
			temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public int Find_LCM(int a,int b) {
		System.out.println("----------------------------");
		System.out.println("The LCM between "+a+" and "+b+" is :");
		int lcm=(a*b)/GCD( a, b);
		return lcm;
		
	}
	
}
