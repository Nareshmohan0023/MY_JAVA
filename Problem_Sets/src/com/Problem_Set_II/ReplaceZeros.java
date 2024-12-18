package com.Problem_Set_II;

public class ReplaceZeros {
    public int Replace_All_Zeros_With_Ones(int num) {
        System.out.println("----------------------------");
        System.out.println("Replacing all 0's with 1's in the number: " + num);

        // Convert the integer to a string
        String numStr = String.valueOf(num);

        // Replace all '0' characters with '1'
        String replacedStr = numStr.replace('0', '1');

        // Convert the modified string back to an integer
        int result = Integer.parseInt(replacedStr);

        return result;
    }
}
