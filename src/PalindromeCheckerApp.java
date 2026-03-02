public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "A man a plan a canal Panama";

        String normalized = original.replaceAll("\\s+", "").toLowerCase();

        if (isPalindrome(normalized, 0, normalized.length() - 1)) {
            System.out.println(original + " is a palindrome (case-insensitive & space-ignored).");
        } else {
            System.out.println(original + " is NOT a palindrome (case-insensitive & space-ignored).");
        }
    }

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}