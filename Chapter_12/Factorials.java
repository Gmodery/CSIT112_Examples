package Chapter_12;

public class Factorials {
    public static void main(String[] args) {
        final int n = 5;

        System.out.println("\nThe factorial of " + n + " is " + factorial_iterative(n));
        System.out.println("\nThe factorial of " + n + " is " + factorial_recursive(n));
    }

    // The iterative version of this method uses a for loop to calculate the nth factorial
    private static int factorial_iterative(int n) {
        int result = 1;

        for (int i = n ; i >= 1 ; i--) {
            result *= i;
        }
        
        return result;
    }

    // The recursive version of this method calls itself to calculate the nth factorial
    private static int factorial_recursive(int n) {
        System.out.print("n is " + n);
        // Base case. Stops recursion once n is 1
        if (n == 1) {
            return 1;
        }

        System.out.println("\tCalling " + n + " * factorial_recursive(" + (n-1) + ")");

        // Recursive step. Always moves closer to the base case
        return n * factorial_recursive(n-1);
    } 
}
