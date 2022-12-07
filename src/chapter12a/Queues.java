package chapter12a;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Queues {
    // Queue is a collection of ordered elements typically used to hold items that are going to be processed in some way
    // Think of the first in, first out FIFO concept

    public static void main(String[] args) {

        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("pear");
        fruit.add("orange");
        fruit.add("lemon");
        fruit.add("pear");

        System.out.println(fruit.size()); // 5
        System.out.println(fruit); // [apple, pear, orange, lemon, pear]
        System.out.println(fruit.add("cherry")); // true
        System.out.println(fruit); // [apple, pear, orange, lemon, pear, cherry]
        System.out.println(fruit.peek()); // apple
        System.out.println(fruit); // [apple, pear, orange, lemon, pear, cherry]
        System.out.println(fruit.remove()); // apple
        System.out.println(fruit); // [pear, orange, lemon, pear, cherry]
        System.out.println(fruit.element()); // pear

    }
}
