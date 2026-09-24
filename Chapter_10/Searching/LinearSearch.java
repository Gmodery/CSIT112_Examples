package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {5,4,3,2,1,6,7,8,9};

        Scanner scan = new Scanner(System.in);

        System.out.print("Target value to search for: ");
        int target = scan.nextInt();
        scan.close();
        
        int index = linearSearch(array, target);

        if (index >= 0) {
            System.out.println("Target found at index " + index);
        } else {
            System.out.println("Target not found");
        }
    }

    // Linear search works by iterating over each element of the array until either the end
    // is reached or the target is found
    public static int linearSearch(int[] array, int target) {
        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
