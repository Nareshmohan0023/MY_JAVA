package com.Problem_Set_I;

public class Nth_term_Fibonacci {
    
    public void Nth_term(int terms) {
        System.out.println();
        System.out.println("--------------------------------");  
        
        int first = 0, second = 1;
        
        // Handle cases where terms is 1 or 2 directly
        if (terms == 1) {
            System.out.println("The Fibonacci number at " + terms + "th term is: " + first);
            return;
        } else if (terms == 2) {
            System.out.println("The Fibonacci number at " + terms + "th term is: " + second);
            return;
        }
        
        // Start the Fibonacci sequence calculation for terms > 2
        int next = 0;
        for (int i = 3; i <= terms; i++) {
            next = first + second;
            first = second;
            second = next;
        }
        
        System.out.println("The Fibonacci number at " + terms + "th term is: " + next);
        System.out.println("--------------------------------");
    }

}

