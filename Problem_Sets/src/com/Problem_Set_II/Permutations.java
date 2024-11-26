package com.Problem_Set_II;

public class Permutations {
    private int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

 
    public int Find_Permutations(int n, int r) {
        System.out.println("----------------------------");
        System.out.println("Calculating the permutations for n = " + n + " and r = " + r);
        
        if (n < r) {
            System.out.println("Error: n cannot be less than r.");
            return -1; // Return -1 to indicate an error
        }
        
        int permutations = factorial(n) / factorial(n - r);
        return permutations;
    }
}
