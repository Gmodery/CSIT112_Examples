package Chapter_13.Stacks;

// The Stack import allows the class to be used
import java.util.Stack;
import java.util.Scanner;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expression = "";
        
        while (!expression.equals("exit")) { 
            System.out.print("\nExpression to evaluate (type exit to quit): ");
            expression = scanner.nextLine();

            String result = (isBalanced(expression)) ? expression + " is balanced" : expression + " is not balanced";

            System.out.println(result);
        }

        scanner.close();
    }


    private static boolean isBalanced(String expression) {
        // Creates a Stack that holds Characters (chars)
        Stack<Character> stack = new Stack<Character>();

        // Iterates over each character of the expression
        for (int i = 0 ; i < expression.length() ; i++) {
            Character c = expression.charAt(i);

            // If the character at position i is an opening parenthesis, add it to the stack
            if (c == '(')
                stack.push(c);

            // Otherwise, if the character at position i is a closing parenthesis...
            else if (c == ')') {
                // And the stack is empty, the expression is unbalanced, so return false
                if (stack.isEmpty())
                    return false;
                // Otherwise pop an opening parenthesis from the stack
                else
                    stack.pop();
            }
        }

        // If the stack is empty by the time the end of the expression is reached, it is balanced
        return stack.isEmpty();
    }
}