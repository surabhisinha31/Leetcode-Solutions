package leetcodeEasy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()]"));
	}
    public static boolean isValid(String s) {
        if(s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            else if(stack.isEmpty() || (stack.peek() == '(' && s.charAt(i) != ')')) {
                return false;
            }
            else if(stack.isEmpty() || (stack.peek() == '{' && s.charAt(i) != '}')) {
                return false;
            }
            else if(stack.isEmpty() || (stack.peek() == '[' && s.charAt(i) != ']')) {
                return false;
            }
            else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
