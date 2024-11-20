package com.Problem_Set_II;

public class Bin_to_Dec {
   
    public int Convert_B_to_D(String binary) {
    	System.out.println("----------------------------");
		System.out.println("The decimal conversion othe given (binary) "+binary+" is :");
        int decimal = 0;
        try {
            decimal = Integer.parseInt(binary, 2); // Convert binary string to decimal
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number entered: " + binary);
        }
        return decimal;
    }
}
