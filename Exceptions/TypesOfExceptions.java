package Exceptions;

import java.lang.reflect.Method;

/*
* This file contains examples of different types of exceptions being handled.
* 
* Note that this is not an exhaustive list of all of the exceptions in Java,
* but rather a demonstration of different types and how to handle them.
*
* In VSCode, if you ctrl + click on each exception, it will open the definition
* of that class. In here, you'll be able to see which class it extends and how it works.
*/

public class TypesOfExceptions {
    public static void main(String[] args) throws ClassNotFoundException {
        
        try {
            String s = null;
            s.charAt(5);
        } catch (NullPointerException npe) {
            System.out.println("Null Pointer Exception");
        }

        try {
            int[] array = {1,2,3};

            array[3] = 4;
        } catch (IndexOutOfBoundsException indexException) {
            System.out.println("Index out of bounds exception");
        }

        try {
            int x = 5 / 0;
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic exception (Divide by zero)");
        }

        // This throws a ClassNotFoundException. Without being indicated in the throws clause
        // in the method header, the compiler would raise an error on this line
        // Alternatively, if it was not indicated in the method header, so long as this line was
        // enclosed in a try-catch block it would pass
        Class.forName("NewClass");

        // This throws a NoSuchMethodException. Without being contained within the try-catch block,
        // the compiler would raise an error on this line. Try copying the line outside of the block 
        // to see what happens.
        // Alternatively, if it was not contained within the try block, NoSuchMethodException could 
        // also be indicated in the method header's throw clause and it would pass
        try {
            Method m = TypesOfExceptions.class.getMethod("otherMethod");
        } catch (NoSuchMethodException ex) {
            System.out.println("No such method exception caught");
        }
    }
}
