package com.Problem_Set_II;

public class Dec_to_Oct {
    public String Convert_D_to_O(int decimal) {
        System.out.println("----------------------------");
        System.out.println("The octal conversion of the given (decimal) " + decimal + " is:");
        String octal = Integer.toOctalString(decimal); // Convert decimal to octal
        return octal;
    }
}
