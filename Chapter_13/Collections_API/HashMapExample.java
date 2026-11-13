package Chapter_13.Collections_API;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creates a HashMap with Integers as the key and Strings as the values
        Map<Integer, String> numberDictionary = new HashMap<Integer, String>();

        // put inserts a key-value pair into the dictionary
        numberDictionary.put(0, "Zero");
        numberDictionary.put(1, "One");
        numberDictionary.put(2, "Two");
        numberDictionary.put(3, "Three");
        numberDictionary.put(4, "For");
        numberDictionary.put(5, "Five");

        // get returns the value associated with a given key
        System.out.println(numberDictionary.get(3));
        System.out.println(numberDictionary.get(5));
        System.out.println(numberDictionary.get(1));
        System.out.println(numberDictionary.get(4));

        // remove removes the key from the dictionary
        numberDictionary.remove(5);

        // put can be used with a key that already exists to update the value associated with it
        numberDictionary.put(4, "Four");

        System.out.println("\n" + numberDictionary.get(4));
    }
}
