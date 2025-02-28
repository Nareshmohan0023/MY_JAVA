package com.Problem_Set_II;

public class CountDigits {
    public int Count_Number_Of_Digits(int number) {
        System.out.println("----------------------------");
        System.out.println("The given number is: " + number);

        int count = 0;

        // Handle negative numbers
        number = Math.abs(number);

        // Count digits
        if (number == 0) {
            count = 1; // Special case for 0
        } else {
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        System.out.println("The number of digits in the given number is:");
        return count;
    }
}
