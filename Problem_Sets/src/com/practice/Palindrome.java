package com.practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string to find is it palindrome :");
		String input=scanner.nextLine();
		
		boolean is_palindrome=is_palindrome(input);
		if(is_palindrome) {
			System.out.println("It is Palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}
	
	public static boolean is_palindrome(String input) {
		input=input.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		
		int left=0;int right =input.length()-1;
		
		while(left<right) {
			if(input.charAt(left)!=input.charAt(right)) {
				return false;
			}
			left++;
			right--;
				
			
			
				
		}
		return true;
		
		
		
	}

}
