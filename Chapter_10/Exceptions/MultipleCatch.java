package Exceptions;

import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        // Take numeric input, go out of bounds, parse to int
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a five-digit code \n> ");

        String code = scan.nextLine();

        scan.close();

        try {
            // This line potentially throws a StringIndexOutOfBoundsException if the 
            // input was less than five digits
            System.out.println("The final digit of the code is " + code.charAt(4));

            // This code potentially throws a NumberFormatException if the input contains
            // non-numeric characters
            int intCode = Integer.parseInt(code);

        } catch (StringIndexOutOfBoundsException strException) {
            // This code is executed if line 19 throws an error
            System.out.println("Code is not five digits");
        } catch (NumberFormatException numException) {
            // This code is executed if line 23 throws an error
            System.out.println("Unable to parse code to integer");
        }
    }
}
