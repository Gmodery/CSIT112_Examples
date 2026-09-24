package Exceptions;

import java.util.Scanner;

public class CustomExceptions {

    // TooLargeException is indicated in the throws clause here because it is checked
    // TooSmallException is unchecked (extends RuntimeException) and is not indicated in the throws clause
    public static void main(String[] args) throws TooLargeException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number between 2 and 5");

        int x = scanner.nextInt();

        scanner.close();

        if (x < 2) {
            throw new TooSmallException();
        } else if (x > 5) {
            throw new TooLargeException();
        }
    }
}

// Runtime exceptions are unchecked and do not require explicit handling nor for 
// the containing method (main, in this case) to list it in the throws clause
class TooSmallException extends RuntimeException {
    public TooSmallException() {
        super("The entered value is too small");
    }
}

// Exceptions are checked, meaning they must either be caught or listed in the throws
// clause of any method that may throw or propagate it
class TooLargeException extends Exception {
    public TooLargeException() {
        super("The entered value is too large");
    }
}