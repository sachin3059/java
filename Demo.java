import java.util.*;

public class Demo{
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        // Adding
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // Duplicate → ignored

        System.out.println(set); // [Banana, Apple, Mango] (unordered)

        // Checking
        System.out.println(set.contains("Apple")); // true

        // Removing
        set.remove("Banana");

        // Iterating
        for (String fruit : set) {
            System.out.println(fruit);
        }

    }
}