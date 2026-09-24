package Exceptions;

public class DivByZero {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        System.out.println(numerator / denominator);

        System.out.println("An exception occurs on the above line, so this code will not execute");
    }
}

/*
 * Output:
 * 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at Exceptions.DivByZero.main(DivByZero.java:8)
 * 
 */