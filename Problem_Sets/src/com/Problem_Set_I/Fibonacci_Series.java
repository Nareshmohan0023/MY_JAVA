package com.Problem_Set_I;

public class Fibonacci_Series {
	 public void printFibonacci(int terms) {
		 System.out.println();
		 System.out.println("--------------------------------");  
		 int first = 0, second = 1;
		 System.out.println("The fibonacci series upto the digits of "+terms);
		 System.out.print("Fibonacci Series: " + first + ", " + second);
		  for (int i = 2; i < terms; i++) {
	            int next = first + second;
	            System.out.print(", " + next);
	            first = second;
	            second = next;
	        }
	       
	    }
 }
