public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "Radar";

        PalindromeChecker checker = new PalindromeChecker();
        if (checker.checkPalindrome(original)) {
            System.out.println(original + " is a palindrome (using PalindromeChecker class).");
        } else {
            System.out.println(original + " is NOT a palindrome (using PalindromeChecker class).");
        }
    }
}

class PalindromeChecker {
    public boolean checkPalindrome(String input) {
        String normalized = input.replaceAll("\\s+", "").toLowerCase();
        int start = 0, end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}