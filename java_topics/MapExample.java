package java_topics;
import java.util.*;

//•	Map is a collection of key values pairs we use HashMap class to work with the map. 
public class MapExample {
    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();

        // Using put() method to add key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Orange");
        map.put(4, "Mango");

        // Printing the map
        System.out.println("HashMap: " + map);

        //Returns all the keys from the map
        System.out.println("HashMap: " + map.keySet());

        //For each loop
        for(int i:map.keySet()){
            System.out.println(i+":"+map.get(i));
        }



    }
}
