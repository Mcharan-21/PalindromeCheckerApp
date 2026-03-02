public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "racecar";

        if (isPalindrome(original, 0, original.length() - 1)) {
            System.out.println(original + " is a palindrome (using recursion).");
        } else {
            System.out.println(original + " is NOT a palindrome (using recursion).");
        }
    }

    static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true; // base condition
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}