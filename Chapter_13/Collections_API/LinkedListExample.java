package Chapter_13.Collections_API;


import java.util.LinkedList;

// Using the Book class from the Linked_Lists example directory
import Chapter_13.Linked_Lists.BookShelf.Book;

public class LinkedListExample {
    public static void main(String[] args) {
        // Collections work with generic object types, such as our
        // custom Book class
        LinkedList<Book> linkedList = new LinkedList<Book>();

        // Adds the elements to the linked list
        linkedList.add(new Book("The Hunger Games"));
        linkedList.add(new Book("The Hobbit"));
        linkedList.add(new Book("Dune"));

        // Returns the String representation of the array
        // Uses the overridden toString method defined
        // in the Book class
        System.out.println(linkedList.toString());

        linkedList.remove(0);

        System.out.println(linkedList.toString());

        // Returns the element at an index
        System.out.println(linkedList.get(1));
        
        // Returns true if the list is empty
        System.out.println("\nList is empty?\n" + linkedList.isEmpty());
    }
}
