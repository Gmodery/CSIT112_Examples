package Chapter_13.Linked_Lists.BookShelf;

// BookList is a collection of Books (BookNodes)
public class BookList {
    // list holds the reference to the first BookNode
    private BookNode list;

    // list is initially set to null (empty)
    public BookList() {
        this.list = null;
    }

    /**
     * Iterates over every element of the linked list until the end is reached (next is null),
     * then places the new node at the end by setting lastNode's .next to it
     * @param book
    */
    public void add(Book book) {
        // Wrap the book in a node
        BookNode node = new BookNode(book);
        
        // Create a current variable to keep track of which node we're looking at
        BookNode current;

        if (list == null) {
            // If list is null, then no nodes have been added yet, so this would be the first one
            list = node;
        } else {
            // Otherwise, list points to a BookNode so start iterating over each node
            current = list;

            // While the next pointer points to an actual object, update current to that next reference
            while (current.next != null) {
                current = current.next;
            }
            
            // Once the above loop finishes and current points to the last node in the list,
            // set current's next pointer to our new node
            current.next = node;
        }
    }

    /**
     * Returns the title of each book in the linkedlist in the order that they appear.
     * @return The title of each book, separated by a newline
     */
    public String toString() {
        String result = "";

        BookNode current = list;

        while (current != null) {
            result += current.book.toString() + "\n";
            current = current.next;
        }

        return result;
    }
}
