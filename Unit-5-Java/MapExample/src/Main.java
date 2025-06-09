import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        //Create a Map to hold a person's name and their favorite number
        // Note Use of Wrapper class Integer instead of primative int
        //Map<key-type, value-type>name     = new typeOfMap<>;
       // Map<String, Integer> peoplesNumbers = new HashMap<>();     //HashMap stores in unknown sequence
        //Map<String, Integer> peoplesNumbers = new TreeMap<>();     //TreeMap stores in sequence based on the type
        Map<String, Integer> peoplesNumbers = new LinkedHashMap<>(); //LinkedHashMap stores in entry sequence



        // Add some entries to our Map
        // .put(key, value) - Add an entry to the Map
        peoplesNumbers.put("Frank",42);
        peoplesNumbers.put("Ravyn", 5);
        peoplesNumbers.put("Missy", 13);
        peoplesNumbers.put("Youssef", 7);
        peoplesNumbers.put("Zach", 51);

        //Find an entry in the Map
        // .get(key-value) - retrieve the value associated with the key
        System.out.println("Ravyn's favorite number is " + peoplesNumbers.get("Ravyn"));
        System.out.println("Missy's favorite number is " + peoplesNumbers.get("Missy"));
        System.out.println("Arnold's favorite number is " + peoplesNumbers.get("Arnold"));

        //Display all the entries in Map
        //entrySet() returns a Set of entries in from the Map
        //Each item in the entrySet is a key-value pair
        //Use setElement.getKey() to retrieve the value of the key
        //Use setElement.getValue() to retrive the value associated with the key
        for(Map.Entry<String, Integer> anEntry : peoplesNumbers.entrySet()){

            System.out.println("\nName: " + anEntry.getKey() + " Favorite number: " + anEntry.getValue());

        }

        //Remove entry from the Map
        peoplesNumbers.remove("Frank");


    }
}