package General_Coding;

import java.util.Random;

public class example_1D_array_loops {
    public static void main(String[] args) {
        // Initializing a new array of random size between 5 and 10
        int size = rand(5, 10);

        int[] array = new int[size];

        // Iterating over each element of array to set it to a new random value
        // Note the use of array.length to ensure that the loop does not go out of bounds
        for (int i = 0 ; i < array.length ; i++) {
            array[i] = rand(0, 10);
        }

        System.out.print("[");

        // Enhanced for loops can also be used to handle assignment and bounds checking
        // These are more limited, however, since you cannot reference surrounding elements
        // because we don't keep track of the index
        for (int num : array) {
            System.out.print(num + ", ");
        }

        System.out.println("]");

    }


    // Returns a random value between [min,limit)
    private static int rand(int min, int limit) {
        Random random = new Random();

        return random.nextInt(limit) + min;
    }
}
