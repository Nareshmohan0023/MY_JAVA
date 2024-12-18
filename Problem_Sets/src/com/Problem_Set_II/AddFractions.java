package com.Problem_Set_II;

public class AddFractions {
    private int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public String Add_Fractions(int num1, int den1, int num2, int den2) {
        System.out.println("----------------------------");
        System.out.println("Adding the fractions: " + num1 + "/" + den1 + " and " + num2 + "/" + den2);

        // Find the common denominator
        int commonDenominator = den1 * den2;

        // Adjust the numerators
        int adjustedNum1 = num1 * den2;
        int adjustedNum2 = num2 * den1;

        // Add the numerators
        int resultNumerator = adjustedNum1 + adjustedNum2;

        // Simplify the result
        int gcd = GCD(resultNumerator, commonDenominator);
        resultNumerator /= gcd;
        commonDenominator /= gcd;

        return resultNumerator + "/" + commonDenominator; // Return the result as a simplified fraction
    }
}
