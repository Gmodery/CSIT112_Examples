package Sorting;

import java.util.Random;
import java.util.Arrays;

// Selection sort works by continuously searching for the smallest element past the currently
// sorted sublist, then swapping it with the next unsorted value

public class SelectionSort {
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
        
        selectionSort(nums);

        System.out.println("Sorted Array:   " + Arrays.toString(nums));

    }

    private static void selectionSort(int[] nums) {
        int min; // min keeps track of the index of the minimum element for each pass
        int temp; // temp is used to swap elements

        // Every item of the list is iterated over. This outer loop sets our starting
        // point on each iteration
        for (int index = 0; index < nums.length - 1; index++) {
            min = index; // Our minimum value index for this pass is started on whatever we begin with

            System.out.println("\n");
            System.out.println("Current Array: " + Arrays.toString(nums));
            System.out.println("Starting at index " + index + " (" + nums[index] + ")");

            // Starting at our outer loop index + 1, look forward and find the index with
            // the smallest value
            for (int scan = index + 1; scan < nums.length; scan++)
                if (nums[scan] < nums[min])
                    min = scan;

            System.out.println("Smallest found at index " + min + " (" + nums[min] + ")");
            System.out.println("Swapping " + nums[min] + " and " + nums[index]);

            // Swap the values
            temp = nums[min];
            nums[min] = nums[index];
            nums[index] = temp;

            System.out.println("New Array after swap: " + Arrays.toString(nums));

        }
    }

}
