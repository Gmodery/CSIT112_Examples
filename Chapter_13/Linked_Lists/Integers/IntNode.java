package Chapter_13.Linked_Lists.Integers;

/**
 * IntNode just holds an integer and a pointer
 * to the next IntNode. Since all it holds is a
 * primitive, no wrapper class is needed like 
 * it is in the other example in this directory
 * (BookShelf)
 * 
 */
public class IntNode {
    int value;
    IntNode next;

    public IntNode(int value) {
        this.value = value;
        this.next = null;
    }
}
