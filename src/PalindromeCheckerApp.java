public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "level";

        PalindromeStrategy strategy = new StackStrategy();
        PalindromeChecker checker = new PalindromeChecker(strategy);

        if (checker.isPalindrome(original)) {
            System.out.println(original + " is a palindrome (using StackStrategy).");
        } else {
            System.out.println(original + " is NOT a palindrome (using StackStrategy).");
        }

        strategy = new DequeStrategy();
        checker.setStrategy(strategy);

        if (checker.isPalindrome(original)) {
            System.out.println(original + " is a palindrome (using DequeStrategy).");
        } else {
            System.out.println(original + " is NOT a palindrome (using DequeStrategy).");
        }
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : input.toCharArray()) stack.push(ch);
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        input = input.replaceAll("\\s+", "").toLowerCase();
        java.util.Deque<Character> deque = new java.util.LinkedList<>();
        for (char ch : input.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    public PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean isPalindrome(String input) {
        return strategy.check(input);
    }
}