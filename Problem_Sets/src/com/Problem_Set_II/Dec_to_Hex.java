package com.Problem_Set_II;

public class Dec_to_Hex {
	public String Convert_D_to_H(int decimal) {
		System.out.println("----------------------------");
        System.out.println("The hexadecimal conversion of the given (decimal) " + decimal + " is:");
        String hex=Integer.toHexString(decimal).toUpperCase();
        return hex;
		
	}

}
