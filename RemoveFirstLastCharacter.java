package StringChallenge;

import java.util.Scanner;

public class RemoveFirstLastCharacter {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String result = removeFirstLastCharacter(input);
        System.out.println("Result after removing first and last character:");
        System.out.println(result);

        scanner.close();
    }

    public static String removeFirstLastCharacter(String str) {
        if (str == null || str.length() <= 2) {
            
            return "";
        }

        
        return str.substring(1, str.length() - 1);
    }
}
