package com.Problem_Set_I;

public class Power_of_num {
	 public int power(int base, int exponent) {
			System.out.println("--------------------------------");
			System.out.println(base +" power "+ exponent +" is :");

	        int result = 1;

	        for (int i = 1; i <= exponent; i++) {
	            result *= base;
	        }

	        return result;
	    }

}
