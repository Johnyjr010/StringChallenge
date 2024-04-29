package StringChallenge;

import java.util.Scanner;

public class StringConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String uppercaseString = convertToUppercase(input);
        String lowercaseString = convertToLowercase(input);
        
        System.out.println("Uppercase: " + uppercaseString);
        System.out.println("Lowercase: " + lowercaseString);
        
        scanner.close();
    }
    public static String convertToUppercase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char)(chars[i] - 'a' + 'A');
            }
        }
        return new String(chars);
    }
    
    public static String convertToLowercase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char)(chars[i] - 'A' + 'a');
            }
        }
        return new String(chars);
    }

}
