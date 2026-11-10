package Chapter_13.Linked_Lists.BookShelf;

// BookNode holds a reference to a Book object 
// and to the next BookNode (null by default)

// This wraps both fields into one Node class
// so that Book objects don't need to hold 
// references to other Books
public class BookNode {
    public Book book;
    public BookNode next;

    public BookNode(Book book) {
        this.book = book;
        this.next = null;
    }
}
