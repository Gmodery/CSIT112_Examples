package Searching;

public class SearchingComparison {
    public static void main(String[] args) {
        int[] largeArray = new int[10_000_000];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i * 2; 
        }
        int target = 18_500_000;

        // Record the starting time
        long startTime = System.nanoTime();

        // Execute Linear Search
        int result = LinearSearch.linearSearch(largeArray, target);

        // Record the ending time
        long endTime = System.nanoTime();

        // Calculate the difference
        long durationNano = endTime - startTime;
        double durationMillis_LS = durationNano / 1_000_000.0;

        // Print results
        System.out.println("========== Linear Search ==========");
        System.out.println("Target found at index: " + result);
        System.out.println("Execution time in milliseconds: " + durationMillis_LS + " ms");



        // Record the starting time
        startTime = System.nanoTime();

        // Execute Binary Search
        result = BinarySearch.binarySearch(largeArray, target);

        // Record the ending time
        endTime = System.nanoTime();

        // Calculate the difference
        durationNano = endTime - startTime;
        double durationMillis_BS = durationNano / 1_000_000.0;

        // Print results
        System.out.println("\n\n========== Binary Search ==========");
        System.out.println("Target found at index: " + result);
        System.out.println("Execution time in milliseconds: " + durationMillis_BS + " ms");


        System.out.println("\n\n========== Comparison ==========");
        System.out.println("Binary Search was " + (durationMillis_LS - durationMillis_BS) + " ms faster than Linear Search");
        System.out.println("This is a " + (((durationMillis_LS - durationMillis_BS) / durationMillis_BS) * 100) + "% improvement");

    }
}
