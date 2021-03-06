import java.util.Stack;

/**
 * Created by Divydeep Agarwal on 2/12/2016.
 */
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
public class isValid {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i) == '(' || (s.charAt(i) == '{') || (s.charAt(i) == '['))){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}

