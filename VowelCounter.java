package StringChallenge;

import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
        
        scanner.close();
    }
    
    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        
        return count;
    }
}
