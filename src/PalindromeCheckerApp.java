import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "rotor";
        Deque<Character> deque = new LinkedList<>();

        for (char ch : original.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(original + " is a palindrome (using deque).");
        } else {
            System.out.println(original + " is NOT a palindrome (using deque).");
        }
    }
}