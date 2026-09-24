package Chapter_11.Exceptions;

public class DivByZeroCaught {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            System.out.println(numerator / denominator);
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero not allowed");
        }

        System.out.println("Because the exception was caught, the code continues as expected");
    }
}

/*
 * Output:
 * 
 * Division by zero not allowed
 * Because the exception was caught, the code continues as expected
 * 
 */