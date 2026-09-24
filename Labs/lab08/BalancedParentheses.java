import java.util.Stack;

public class BalancedParentheses {
    public static boolean areParenthesesBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false; 
                }
            }
        
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[(])}";
        String expression3 = "{{[[((()))]]}}";

        System.out.println("Expression 1: " + expression1 + " is balanced: " + areParenthesesBalanced(expression1));
        System.out.println("Expression 2: " + expression2 + " is balanced: " + areParenthesesBalanced(expression2));
        System.out.println("Expression 3: " + expression3 + " is balanced: " + areParenthesesBalanced(expression3));
    }
}