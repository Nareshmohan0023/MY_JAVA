package com.Problem_Set_I;

public class Strong_number {
	  // Function to calculate factorial of a number
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if the number is a Strong number
    public void isStrongNumber(int number) {
    	System.out.println();
    	 System.out.println("--------------------------------");  
         System.out.print("the number "+number+ " is ");
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit); // Add the factorial of the digit to sum
            number /= 10; // Remove the last digit
        }

       if(originalNumber==sum) {
    	   System.out.println("strong number");
       }
       else {
    	   System.out.println("Not a strong number");
       }
    }

}
