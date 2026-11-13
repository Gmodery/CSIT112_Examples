package Chapter_13.Collections_API;

import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        // This ArrayList can hold only Integers
        ArrayList<Integer> intList = new ArrayList<Integer>();

        // Adds an element to the ArrayList
        intList.add(5);
        intList.add(7);
        intList.add(9);
        intList.add(11);
        intList.add(13);

        // Returns the String representation of the ArrayList
        System.out.println(intList.toString());

        // Removes element at specified index and shrinks list accordingly
        intList.remove(1);

        System.out.println(intList.toString());
        
        // Returns the element at an index
        System.out.println(intList.get(2));

        int target = 11;

        // Returns true if the element was found in the list
        System.out.println("\nList contains " + target + "?\n" + intList.contains(target));
        
        // Returns true if the list is empty
        System.out.println("List is empty?\n" + intList.isEmpty());

    }
}
