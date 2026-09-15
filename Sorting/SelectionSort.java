package Sorting;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        final int SIZE = 10;

        // int[] nums = new int[SIZE];

        // Use random numbers
        // Random random = new Random();

        // for (int i = 0 ; i < SIZE ; i++) {
        //     nums[i] = random.nextInt(21);
        // }

        int[] nums = {4,7,9,3,8,1,2,5,6};

        selectionSort(nums);

        for (int num : nums)
            System.out.print(num + ", ");
    }

    private static void selectionSort(int[] nums) {
        int min; // min keeps track of the index of the minimum element for each pass
        int temp; // temp is used to swap elements

        // Every item of the list is iterated over. This outer loop sets our starting
        // point on each iteration
        for (int index = 0; index < nums.length - 1; index++) {
            min = index; // Our minimum value index for this pass is started on whatever we begin with

            System.out.println("\n\n\n");
            System.out.println("Starting at index " + index);

            // Starting at our outer loop index + 1, look forward and find the index with
            // the smallest value
            for (int scan = index + 1; scan < nums.length; scan++)
                if (nums[scan] < nums[min])
                    min = scan;

            System.out.println("Smallest found at index " + min + " (" + min + ")");

            // Swap the values
            temp = nums[min];
            nums[min] = nums[index];
            nums[index] = temp;
        }
    }

    private static void printArray() {
        
    }

}
