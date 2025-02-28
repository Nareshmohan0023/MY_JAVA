package com.Problem_Set_II;

public class SumOfTwoPrimes {
    public boolean Is_Prime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public String Can_Be_Expressed_As_Sum_Of_Two_Primes(int num) {
        System.out.println("----------------------------");
        System.out.println("Checking if the number " + num + " can be expressed as a sum of two primes:");

        for (int i = 2; i <= num / 2; i++) {
            if (Is_Prime(i) && Is_Prime(num - i)) {
                return num + " can be expressed as the sum of " + i + " and " + (num - i);
            }
        }

        return num + " cannot be expressed as the sum of two prime numbers.";
    }
}
