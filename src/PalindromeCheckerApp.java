// UseCase1PalindromeCheckerApp.java

// Class acts as container for application logic



public class PalindromeCheckerApp {


    public static void main(String[] args) {

        // Define input string
        String input = "madam";

        // Print input
        System.out.println("Input : " + input);

        // Call recursive check method
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Print result
        System.out.println("Is Palindrome? : " + isPalindrome);
    }


    private static boolean check(String s, int start, int end) {

        // Base condition: crossed indices
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}