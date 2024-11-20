package com.Problem_Set_I;

public class Sum_of_prime_interval {
    
    
    public boolean Is_Prime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public Integer Sum(int a, int b) {
		System.out.println("--------------------------------");
		System.out.println("the sum of prime between the interval "+a+" and "+b+ " is :");

        int sum = 0;
        int temp;

        
        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        
        for (int i = a; i <= b; i++) {
            if (Is_Prime(i)) {
                sum += i;  
            }
        }

        return sum;
    }

  
}
