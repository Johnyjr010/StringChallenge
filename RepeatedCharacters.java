package StringChallenge;

import java.util.HashMap;
import java.util.Map;


public class RepeatedCharacters {
    public static void main(String[] args) {
        String input = "hello world";
        printRepeatedCharacters(input);
    }
    
    public static void printRepeatedCharacters(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("No repeated characters found.");
            return;
        }
        
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        boolean foundRepeated = false;
        System.out.println("Repeated characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
                foundRepeated = true;
            }
        }
        
        if (!foundRepeated) {
            System.out.println("No repeated characters found.");
        }
    }


}
