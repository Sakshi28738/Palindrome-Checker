// UseCase1PalindromeCheckerApp.java

// Class acts as container for application logic
public class PalindromeCheckerApp {

    // Main method - entry point of Java application
    public static void main(String[] args) {

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equals(reversed);

        System.out.println("Input text : madam");
        System.out.println("Is it a palindrome? " + isPalindrome);
    }
}
