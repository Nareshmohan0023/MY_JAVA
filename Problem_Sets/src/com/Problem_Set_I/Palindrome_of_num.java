package com.Problem_Set_I;

public class Palindrome_of_num {
	public Integer Reverse(int n) {
		System.out.println("--------------------------------");
		int reversed=0;
		System.out.println("the number is "+n);
		while(n!=0) {
			reversed=reversed*10+(n%10);
			n=n/10;
		}
		return reversed;
		
	}
	public String Is_palindrome(int n) {
		if(n==Reverse(n)) {
			return "Palindrome";
		}
		else {
			return "Not a Palindrome";
		}
	}

}
