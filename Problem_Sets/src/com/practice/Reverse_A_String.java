package com.practice;

import java.util.Scanner;

public class Reverse_A_String {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string :");
		String input=scanner.nextLine();
		
		System.out.println("the reversed string is: ");
		System.out.println(reverseStr(input));
		
		}
	
	public static String reverseStr(String x) {
		StringBuilder reversed=new StringBuilder();
		for (int i=x.length()-1;i>=0;i--) {
			reversed.append(x.charAt(i));
		}
		return reversed.toString();

	}



}
