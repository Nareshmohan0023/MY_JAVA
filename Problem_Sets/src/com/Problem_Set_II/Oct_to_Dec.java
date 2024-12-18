package com.Problem_Set_II;

public class Oct_to_Dec {
    
    public int Convert_O_to_D(String octal) {
        System.out.println("----------------------------");
        System.out.println("The decimal conversion of the given (octal) " + octal + " is:");
        int decimal = 0;
        try {
            decimal = Integer.parseInt(octal, 8); // Convert octal string to decimal
        } catch (NumberFormatException e) {
            System.out.println("Invalid octal number entered: " + octal);
        }
        return decimal;
    }
}
