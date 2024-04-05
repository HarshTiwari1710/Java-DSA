import java.util.*;
public class LearnMaps {
    public static void main(String[] args) {

        //O(1)
        
        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("One", 1);
        numbers.put("Fifty four", 54);
        numbers.put("sixty five", 65);
        numbers.put("ninety nine", 99);
        numbers.put("forty seven", 47);
        if(numbers.containsKey("Two")){
            numbers.put("Two", 2);
        }
        numbers.putIfAbsent("Two", 23);
        System.out.println(numbers);
        for(Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
    
}
