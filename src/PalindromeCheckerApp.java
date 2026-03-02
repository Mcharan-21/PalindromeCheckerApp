import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "racecar";
        Stack<Character> stack = new Stack<>();

        for (char ch : original.toCharArray()) {
            stack.push(ch);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome (using stack).");
        } else {
            System.out.println(original + " is NOT a palindrome (using stack).");
        }
    }
}