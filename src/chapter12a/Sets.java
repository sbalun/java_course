package chapter12a;

import java.util.HashSet;
import java.util.Set;

class Sets {

    // A Set is an unordered collection of unique objects
    // Can hold any type of object (not just strings like demonstrated below)
    // If attempt to add duplicate no error will occur but dup won't be added

    public static void main(String[] args) {

        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("pear");

        System.out.println(fruit.size());
        System.out.println(fruit);
        fruit.remove("pear");
        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println(fruit.contains("banana"));
        System.out.println(fruit.isEmpty());
        fruit.clear();
        System.out.println(fruit.isEmpty());
    }
}