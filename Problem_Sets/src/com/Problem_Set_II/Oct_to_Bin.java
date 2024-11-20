package com.Problem_Set_II;

public class Oct_to_Bin {
    public String Convert_O_to_B(String octal) {
        System.out.println("----------------------------");
        System.out.println("The binary conversion of the given (octal) " + octal + " is:");
        String binary = "";
        try {
            // Convert octal to decimal first
            int decimal = Integer.parseInt(octal, 8);
            // Convert decimal to binary
            binary = Integer.toBinaryString(decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number entered: " + octal);
        }
        return binary;
    }
}
