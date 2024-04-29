package StringChallenge;

import java.util.Scanner;

public class RemoveWord {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Enter the word to remove:");
        String wordToRemove = scanner.nextLine();

        String result = removeWord(input, wordToRemove);
        System.out.println("Result after removing '" + wordToRemove + "':");
        System.out.println(result);

        scanner.close();
    }

	public static String removeWord(String str, String wordToRemove) 
	{
        if (str == null || str.isEmpty() || wordToRemove == null || wordToRemove.isEmpty()) 
        {
            return str;
        }

       
        String[] words = str.split("\\s+");

        StringBuilder resultBuilder = new StringBuilder();

   
        for (String word : words) 
        {
            if (!word.equals(wordToRemove)) 
            {
                resultBuilder.append(word).append(" ");
            }
        }

        
        return resultBuilder.toString().trim();
    }
	}

