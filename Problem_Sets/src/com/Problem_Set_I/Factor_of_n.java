package com.Problem_Set_I;

public class Factor_of_n {
	public void factor(int n) {
	
        System.out.println("--------------------------------");  
        System.out.print("the factors of number "+n+ " is 1");
		for (int i=2;i<=n;i++) {
			if(n%i==0) {
				System.out.print(","+i);
			}
		}
	}

}
