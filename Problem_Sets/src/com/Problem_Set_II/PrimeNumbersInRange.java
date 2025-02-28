package com.Problem_Set_II;

public class PrimeNumbersInRange {
    public boolean Is_Prime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Method to find all prime numbers between 1 and 100
    public String Find_Primes_Between_1_To_100() {
        System.out.println("----------------------------");
        System.out.println("Finding all prime numbers between 1 and 100:");
        
        StringBuilder primes = new StringBuilder();
        for (int i = 2; i <= 100; i++) {
            if (Is_Prime(i)) {
                primes.append(i).append(" ");
            }
        }
        
        return primes.toString();
    }
}
