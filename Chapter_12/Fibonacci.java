package Chapter_12;

public class Fibonnaci {
    public static void main(String[] args) {
        int result = fibonacci(5);
 
        System.out.println(result);
    }

    private static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
