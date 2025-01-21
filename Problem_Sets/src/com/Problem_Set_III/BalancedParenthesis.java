package com.Problem_Set_III;



import java.util.Stack;

public class BalancedParenthesis {
    public  void find() {
    	System.out.println("(Q-25)------------------------------");

        String expression = "{[()]}";
        System.out.println("the parenthesis:"+expression);
        if (isBalanced(expression)) {
            System.out.println("The expression is balanced.");
        } else {
            System.out.println("The expression is not balanced.");
        }
    }

    public static boolean isBalanced(String expression) {
        // Stack to hold opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the expression
        for (char ch : expression.toCharArray()) {
            // If it's an opening bracket, push it to the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If it's a closing bracket, check for balance
            else if (ch == ')' || ch == '}' || ch == ']') {
                // If the stack is empty, it's unbalanced
                if (stack.isEmpty()) {
                    return false;
                }

                // Pop the top element and check for matching brackets
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        // If the stack is empty, the expression is balanced
        return stack.isEmpty();
    }

    // Helper function to check if two brackets are matching pairs
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}

