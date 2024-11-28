package com.Problem_Set_III;

import java.util.Arrays;

public class Longest_Palindrome_Array {

 public static String LongestPalindrome() {
	 	System.out.println();
    	System.out.println("question(11)----------------------------");
    	Object[] array = {121, 456, 343, "madam", "hello", 12321};

        String longestPalindrome = ""; 
        // To store the longest palindrome

        for (Object element : array) {
            // Convert the current element to a string
            String str = element.toString();

            // Check if the string is a palindrome
            if (isPalindrome(str)) {
                // If it's longer than the current longest, update it
                if (str.length() > longestPalindrome.length()) {
                    longestPalindrome = str;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        return longestPalindrome; // Return the result
    }

   
  public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; 
                // Not a palindrome
            }
            start++;
            end--;
        }

        return true; // It's a palindrome
    }
}

 
