package Sorting;

import java.util.Arrays;
import java.util.Random;

// Insertion sort works similar to selection sort in that it swaps elements, but is fundamentally
// different in its approach. Instead of searching the entire list for the next smallest value,
// it iteratively places values into their correct positions at each step

public class InsertionSort {

        public static void main(String[] args) {
        int[] nums = {4,7,9,3,8,1,2,5,6};

        // Uncomment the following lines to use random numbers

        // final int SIZE = 10;

        // nums = new int[SIZE];

        // // Use random numbers
        // Random random = new Random();

        // for (int i = 0 ; i < SIZE ; i++) {
        //     nums[i] = random.nextInt(21);
        // }

        
        System.out.println("Original Array: " + Arrays.toString(nums));
        
        insertionSort(nums);
        
        System.out.println("Sorted Array:   " + Arrays.toString(nums));
    }

    public static void insertionSort(int[] nums) {
        // Iterate from the second element (index 1) to the end of the array
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i]; // The element currently being positioned into its proper place
            int j = i - 1; // The position of the element before nums[i]

            System.out.println("\n\n\n");
            System.out.println("Current Array: " + Arrays.toString(nums));
            System.out.println("Placing value at index " + i + " (" + key + ")");

            // So long as there is a previous element (we aren't already at the start of the 
            // array and can't look back any farther (because accessing nums[-1] would throw 
            // an error)) AND the value we are placing (key) is LESS THAN the value at the 
            // previous index, move everything forward to make space for the new element
            while (j >= 0 && key < nums[j]) {
                System.out.println("\tj is index " + j + " (" + nums[j] + ")");
                System.out.println("\t\t" + key + " is less than " + nums[j]);
                System.out.println("\t\t\t" + "Moving " + nums[j] + " to index " + (j+1));
                
                nums[j + 1] = nums[j];
                j--;
            }
            // Place the key at its correct sorted position
            nums[j + 1] = key;

            System.out.println(key + " has been placed at index " + (j+1));
            System.out.println("New Array: " + Arrays.toString(nums));
        }
    }


}
