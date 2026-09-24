package Exceptions;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        // Take numeric input, go out of bounds, parse to int
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a five-digit code \n> ");

        String code = scan.nextLine();

        scan.close();

        int intCode = processInput(code);
        
    }


    public static int processInput(String code) {
        // Imagine "usingResource" as a resource that MUST be closed (set to false) before this method exits
        // Leaving it open (set to true) would result in memory leakage
        boolean usingResource = true;

        try {
            // This line potentially throws a StringIndexOutOfBoundsException if the
            // input was less than five digits
            System.out.println("The final digit of the code is " + code.charAt(4));

            // This code potentially throws a NumberFormatException if the input contains
            // non-numeric characters
            int intCode = Integer.parseInt(code);

            return intCode;

        } catch (StringIndexOutOfBoundsException strException) {
            // This code is executed if line 25 throws an error
            System.out.println("Code is not five digits");

            return -1;

        } catch (NumberFormatException numException) {
            // This code is executed if line 29 throws an error
            System.out.println("Unable to parse code to integer");

            return -1;

        } finally {
            // The code in this block will always execute, even if an error is thrown

            // Here we can have some cleanup code. We must ensure that usingResource is set
            // to false regardless of whether or not an exception occurs, so this is the
            // ideal place to do it. 
            // This will run after an exception occurs, and if an exception does not occur, 
            // it is still run just before the return from the try block is called
            usingResource = false;
            System.out.println("usingResource done");
        }

        // Why not put this here? This is unreachable code since we're returning in the try and catch blocks.
        // Additionally, even if we did not return earlier and this line did execute, it would only do so if
        // no exception occurred, which is not what we want. We want it to happen regardless

        // usingResource = false;
    }
}
