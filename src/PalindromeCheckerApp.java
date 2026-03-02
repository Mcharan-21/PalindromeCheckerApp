public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "madam";
        char[] chars = original.toCharArray();

        boolean isPalindrome = true;
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome (using char array).");
        } else {
            System.out.println(original + " is NOT a palindrome (using char array).");
        }
    }
}