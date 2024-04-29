package StringChallenge;

import java.util.Scanner;

public class AlphaNum {

    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the alphanumeric string:");
        String input = scn.nextLine();

        System.out.println("Digits in the string:");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                System.out.print(ch);
            }
        }
    }
}

