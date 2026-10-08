package Chapter_12;

public class ReverseString {
    public static void main(String[] args) {
        final String str = "Hello!";

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverse(str));
    }

    public static String reverse(String str) {
        // Our base case stops and returns the empty string if we run out of characters
        if (str.length() == 0) {
            return str;
        }

        // The recursive part of this algorithm appends the first character of the current String
        // to the return value of reverse called with the substring
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
