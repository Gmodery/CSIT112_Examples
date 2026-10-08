package Chapter_12;

public class Summation {
    public static void main(String[] args) {
        // This is the initial invocation of the summation method
        int result = summation(10);

        System.out.println(result);
    }

    // This method is recursive in that it is defined in terms of itself
    // It will return the current parameter (n) + summation(n-1), 
    // which in turn returns (n) + summation(n-1), and so on
    private static int summation(int n) {
        System.out.print("n is " + n);
        if (n == 1) {
            return 1;
        }

        System.out.println("\tCalling " + n + " * factorial_recursive(" + (n - 1) + ")");

        return n + summation(n-1);
    }
}
