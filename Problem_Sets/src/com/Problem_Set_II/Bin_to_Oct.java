package com.Problem_Set_II;

public class Bin_to_Oct {
    public String Convert_B_to_O(String binary) {
        System.out.println("----------------------------");
        System.out.println("The octal conversion of the given (binary) " + binary + " is:");
        String octal = "";
        try {
            // Convert binary to decimal first
            int decimal = Integer.parseInt(binary, 2);
            // Convert decimal to octal
            octal = Integer.toOctalString(decimal);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number entered: " + binary);
        }
        return octal;
    }
}
