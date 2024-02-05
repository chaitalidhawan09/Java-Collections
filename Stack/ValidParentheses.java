package Stack;
import java.util.Stack;
public class ValidParentheses 
{

	public ValidParentheses() 
	{

	
	}
	public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (!stack.isEmpty() &&
                    ((c == ')' && stack.peek() == '(') ||
                     (c == ']' && stack.peek() == '[') ||
                     (c == '}' && stack.peek() == '{'))) {
                stack.pop();
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }


	public static void main(String[] args) 
	{
		 String parentheses = "{[()]}";

	        if (isValid(parentheses)) {
	            System.out.println("The parentheses are valid.");
	        } else {
	            System.out.println("The parentheses are not valid.");
	        }
		
	}

}
