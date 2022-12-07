package chapter12a;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {
        // Maps use Key - Value pairs
        // You access an element using it's key.  Keys are unique.  Values aren't
        // The put method needs a "key" and a "value"

        Map fruitCalories = new HashMap();
        fruitCalories.put("apple",95);
        fruitCalories.put("banana",120);
        fruitCalories.put("cherry",85);
        fruitCalories.put("lemon",200);
        fruitCalories.put("mango",75);

        System.out.println(fruitCalories); // {banana=120, apple=95, cherry=85, lemon=200, mango=75}
        System.out.println(fruitCalories.size()); // 5
        System.out.println(fruitCalories.get("cherry")); // 85
        System.out.println(fruitCalories.entrySet()); // [banana=120, apple=95, cherry=85, lemon=200, mango=75]
        System.out.println(fruitCalories.keySet()); // [banana, apple, cherry, lemon, mango]
        System.out.println(fruitCalories.containsKey("kiwi")); // false
        System.out.println(fruitCalories.containsKey("mango")); // true
    }
}
