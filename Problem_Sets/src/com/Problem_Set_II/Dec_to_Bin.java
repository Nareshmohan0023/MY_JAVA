package com.Problem_Set_II;

public class Dec_to_Bin {
    // Method to convert a decimal number to its binary equivalent
    public String Convert_D_to_B(int decimal) {
        System.out.println("----------------------------");
        System.out.println("The binary conversion of the given (decimal) " + decimal + " is:");
        String binary = Integer.toBinaryString(decimal); // Convert decimal to binary
        return binary;
    }
}
