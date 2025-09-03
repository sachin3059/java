import java.util.*;

public class Demo{
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Alice");
        map.put(2, "Bob");
        map.put(3, "Charlie");
        map.put(2, "Bobby"); // key already exists → value updated

        // Accessing
        System.out.println(map.get(2)); // Bobby
        System.out.println(map.containsKey(3)); // true
        System.out.println(map.containsValue("Charlie")); // true

        // Removing
        map.remove(1);

        // Iterating
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}