package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        // Binary search requires the elements to be sorted
        int[] array = {1,2,3,4,5,6,7,8,9};

        Scanner scan = new Scanner(System.in);

        System.out.print("Target value to search for: ");
        int target = scan.nextInt();
        scan.close();
        
        int index = binarySearch(array, target);

        if (index >= 0) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found");
        }
    }


    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int mid; 

        while (left <= right) {
            mid = (left + ((right - left) / 2)); // Overflow-safe midpoint calculation

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
