package com.Problem_Set_I;

public class Leap_Year {
	public String Leapyear(int year) {
		System.out.println("--------------------------------");
		System.out.println("the year "+year+ " is a");
		 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
	        return "leap Year";
	     } 
		 else {
	        return "not a leap year";
	     }

		
	}

}
