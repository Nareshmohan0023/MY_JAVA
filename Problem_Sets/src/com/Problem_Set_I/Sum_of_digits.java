package com.Problem_Set_I;

public class Sum_of_digits {
	public Integer Sum(int n) {
		System.out.println("--------------------------------");
		System.out.println("The sum of the Digits is :");
		int sum=0;
		while (n != 0) {
	       sum += n % 10;  	            
	       n = n / 10;    	        
	    }
		return sum;
	}

}
