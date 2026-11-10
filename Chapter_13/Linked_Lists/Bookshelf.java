package Chapter_13.Linked_Lists;

public class Bookshelf {
    public static void main(String[] args) {
        BookList list = new BookList();

        list.add(new Book("The Three Body Problem"));
        list.add(new Book("The Dark Forest"));
        list.add(new Book("Death's End"));
        list.add(new Book("The Problem of Pain"));

        System.out.println(list.toString());
    }
}
