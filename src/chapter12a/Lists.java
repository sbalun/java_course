package chapter12a;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    // Lists are ordered
    // Elements are accessed by their position
    // Some implementations of lists are ArrayList, LinkedList, Stack and Vector
    // Can contain duplicate elements

    public static void main(String[] args) {

        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("pear");
        fruit.add("orange");
        fruit.add("lemon");
        fruit.add("pear");

        List foo = new ArrayList();
        foo.add("bar");
        foo.add("bar one");

        System.out.println("The fruit list contains an apple? " + fruit.contains("apple"));
        System.out.println("The size of the fruit list is " + fruit.size());
        System.out.println("The fruit located at the 0th position is " + fruit.get(0));
        System.out.println("This is the contents of list fruit " + fruit);
        fruit.add(5,"grapefruit");
        System.out.println("This is the contents of list fruit after adding grapefruit" + fruit);
        fruit.addAll(0, foo);
        System.out.println(fruit);
        List bar = new ArrayList();
        bar = fruit.subList(0,2);
        System.out.println(bar);
    }
}
