package Chapter_13.Collections_API;

import java.util.ArrayList;

public class LambdasExample {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println("List: " + list.toString());

        System.out.println("Even numbers from list:");
        evenFilter(list);

        System.out.println("\n\n2x each number from list:");
        doubleStream(list);

        System.out.println("\n\nSum of all numbers in list:\n" + streamSum(list));
    }

    public static void evenFilter(ArrayList<Integer> list) {
        list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
    }

    public static void doubleStream(ArrayList<Integer> list) {
        list.stream().map(x -> x * 2).forEach(x -> System.out.println(x));
    }

    public static int streamSum(ArrayList<Integer> list) {
        return list.stream().mapToInt(x -> x).sum();
    }
}
