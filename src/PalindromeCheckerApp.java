// UseCase1PalindromeCheckerApp.java

// Class acts as container for application logic

import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {



        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare elements from both ends
        while (list.size() > 1) {

            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}