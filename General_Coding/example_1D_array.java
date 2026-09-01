package General_Coding;
import java.util.*;

public class example_1D_array {
    
    public static void main(String[] args) {
        // Scanners allow input to be taken from the user
        Scanner s = new Scanner(System.in);
        
        // This line prints to the terminal
        System.out.print("Enter a number: ");
        
        // s.nextLine() invokes the nextLine method of the scanner object we created
        // This method takes the full next line of input from the user as a String
        // We store the input in "input"
        String input = s.nextLine();

        // Since input is a String and we need it to be a numeric data type (integer),
        // we use the Integer.parseInt() method to convert it
        // This integer is stored in num
        int num = Integer.parseInt(input);

        // Arrays need to be initialized with a predefined size (how many elements it can store)
        // Depending on the user's input, a new array of size 'num' is created
        int[] array = new int[num];

        // The for loop iterates five times (0 to 4), printing the iteration number and 
        // Inserting 2 times the iteration number to the array
        for (int i = 0 ; i < num ; i++) {
            System.out.println(i);

            // Set array at index 'i' to two times 'i'
            array[i] = i*2;
        }

        // The enhanced for loop can be used to automatically iterate over every element
        // in an array, rather than specifying the exact length. This is similar to Python's
        // for loops like 'for num in array:'
        // The alternative way to do this in Java would be the following:
        // for (int i = 0 ; i < array.length ; i++) {...}
        for (int n : array) {
            System.out.print(n + ", ");
        }

        // The scanner is closed to prevent memory leaks
        s.close();
    }

}
