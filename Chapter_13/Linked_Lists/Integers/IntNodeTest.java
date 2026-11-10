package Chapter_13.Linked_Lists.Integers;

public class IntNodeTest {
    public static void main(String[] args) {
        IntNodeList list = new IntNodeList();

        list.addSorted(new IntNode(5));
        list.addSorted(new IntNode(4));
        list.addSorted(new IntNode(9));
        list.addSorted(new IntNode(1));
        list.addSorted(new IntNode(12));

        System.out.println(list.toString());
    }
}
