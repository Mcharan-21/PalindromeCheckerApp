public class PalindromeCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Palindrome Checker Application");

        String word = "radar";
        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equals(reversed)) {
            System.out.println(word + " is a palindrome!");
        } else {
            System.out.println(word + " is not a palindrome!");
        }
    }
}