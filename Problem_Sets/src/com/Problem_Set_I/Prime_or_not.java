package com.Problem_Set_I;

public class Prime_or_not {
	public String Is_Prime(int n) {
	System.out.println("--------------------------------");

	if(n<=1) {
		return "not a prime";
	}
	else {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return "not a prime";
			}
			
		}
	}
	return "prime";
	}

}
