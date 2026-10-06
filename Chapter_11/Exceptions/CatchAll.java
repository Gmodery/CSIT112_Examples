package Chapter_11.Exceptions;

import java.util.Scanner;

public class CatchAll {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numerator = 10;

        // As we have seen, the following code can throw an ArithmeticException (/ by 0) and 
        // a InputMismatchException (by not entering an int when prompted)
        // Previously, we used multiple catch blocks for each specific exception that could occur
        // Polymorphism enables us to use one catch block for a multitude of different exceptions
        try {
            System.out.println("Enter a number to divide 10 by: ");

            int denominator = scan.nextInt();

            System.out.println("Result: " + (numerator / denominator));
        } catch (Exception ex) {
            System.out.println("Same handler regardless of the exception!");
            ex.printStackTrace();
        } finally {
            scan.close();
            System.out.println("Done");
        }
    }
}
