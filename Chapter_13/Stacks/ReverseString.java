package Chapter_13.Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phrase = "";
        
        while (!phrase.equals("exit")) { 
            System.out.print("\nPhrase to reverse (type exit to quit): ");
            phrase = scanner.nextLine();

            System.out.println(reverse(phrase));
        }

        scanner.close();
    }


    private static String reverse(String phrase) {
        // Creates a Stack that holds Characters (chars)
        Stack<Character> stack = new Stack<Character>();

        // Iterates over each character of the phrase
        for (int i = 0 ; i < phrase.length() ; i++) {
            stack.push(phrase.charAt(i));
        }

        String result = "";

        // Pops each character from the stack, starting at the top, and appends it to result
        while (!stack.isEmpty())
            result += stack.pop();

        // If the stack is empty by the time the end of the phrase is reached, it is balanced
        return result;
    }
}
