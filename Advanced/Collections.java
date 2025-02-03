// Advanced/Collections.java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collections {
    public static void main(String[] args) {

        // List Example (ArrayList)
        System.out.println("--- List Example (ArrayList) ---");
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicates allowed

        System.out.println("Fruits List: " + fruits);

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Iterating over the list
        System.out.println("Iterating over list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Set Example (HashSet)
        System.out.println("\n--- Set Example (HashSet) ---");
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Orange");
        uniqueFruits.add("Apple"); // Duplicates ignored

        System.out.println("Unique Fruits Set: " + uniqueFruits);

        // Map Example (HashMap)
        System.out.println("\n--- Map Example (HashMap) ---");
        Map<String, Integer> fruitQuantities = new HashMap<>();
        fruitQuantities.put("Apple", 3);
        fruitQuantities.put("Banana", 5);
        fruitQuantities.put("Orange", 2);

        System.out.println("Fruit Quantities Map: " + fruitQuantities);

        // Accessing values
        System.out.println("Quantity of Bananas: " + fruitQuantities.get("Banana"));

        // Iterating over the map
        System.out.println("Iterating over map:");
        for (Map.Entry<String, Integer> entry : fruitQuantities.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
