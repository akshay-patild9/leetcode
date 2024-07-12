package leetCode;

import java.util.Stack;

public class ReverseStringPara {

	public static void main(String[] args) {
		
		String s = "(ed(et(oc))el)";
		//System.out.println(s.substring(s.lastIndexOf("(")+1,s.indexOf(")")));
		String ans = reverseWithoutPara(s);
		System.out.println(ans);
	}

	private static String reverseWithoutPara(String s) {
          Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
        	System.out.println(stack);
            if (c == ')') {
                StringBuilder sb = new StringBuilder();
                // Pop characters until '(' is found
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }
                // Pop the '(' from the stack
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                }
                // Push the reversed substring back into the stack
                for (char ch : sb.toString().toCharArray()) {
                    stack.push(ch);
                }
            } else {
                stack.push(c);
            }
        }
        
        // Join the stack to form the final result string
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        
        return result.toString();
	}

}
