package Chapter_13.Linked_Lists.Integers;

import Chapter_13.Linked_Lists.BookShelf.BookNode;

public class IntNodeList {
    private IntNode head;

    public IntNodeList() {
        this.head = null;
    }

    /**
     * Adds the passed node to the linked list
     * according to its proper position in 
     * ascending order
     */
    public void addSorted(IntNode node) {
        IntNode current;
        
        if (head == null) {
            head = node; 
        } else if (head.value > node.value) {
            node.next = head;
            head = node;
        } else {
            current = head;

            while (current.next != null && current.next.value < node.value) {
                current = current.next;
            }

            if (current.next == null) {
                current.next = node;
            } else {
                node.next = current.next;
                current.next = node;
            }
        }
    }


    public String toString() {
        String result = "";

        IntNode current = head;

        while (current != null) {
            result += Integer.toString(current.value) + "\n";
            current = current.next;
        }

        return result;
    }
}
