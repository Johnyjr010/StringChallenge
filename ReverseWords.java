package StringChallenge;

import java.util.Scanner;

public class ReverseWords {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();
	        
	        String reversedWords = reverseWords(input);
	        System.out.println("Reversed words: " + reversedWords);
	        
	        scanner.close();
	    }
	    
	    public static String reverseWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }
	        
	        String[] words = str.split("\\s+");
	        StringBuilder reversedString = new StringBuilder();
	        
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedString.append(words[i]).append(" ");
	        }
	        
	        return reversedString.toString().trim();
	    }

}
