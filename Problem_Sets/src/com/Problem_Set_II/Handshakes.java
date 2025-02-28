package com.Problem_Set_II;

public class Handshakes {
    public int Max_Handshakes(int n) {
        System.out.println("----------------------------");
        System.out.println("Calculating the maximum number of handshakes for n = " + n);
        
        if (n < 2) {
            System.out.println("A handshake requires at least 2 people.");
            return 0; // No handshakes possible
        }
        
        int handshakes = (n * (n - 1)) / 2; // Using the formula C(n, 2)
        return handshakes;
    }
}
