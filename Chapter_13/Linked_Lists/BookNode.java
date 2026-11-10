package Chapter_13.Linked_Lists;

// BookNode holds a reference to a Book object and to the next BookNode (null by default)
public class BookNode {
    public Book book;
    public BookNode next;

    public BookNode(Book book) {
        this.book = book;
        this.next = null;
    }
}
