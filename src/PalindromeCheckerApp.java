public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String testString = "A man a plan a canal Panama";

        String normalized = testString.replaceAll("\\s+", "").toLowerCase();

        long startStack = System.nanoTime();
        boolean stackResult = new StackStrategy().check(normalized);
        long endStack = System.nanoTime();
        System.out.println("Stack result: " + stackResult + ", Time: " + (endStack - startStack) + " ns");

        long startDeque = System.nanoTime();
        boolean dequeResult = new DequeStrategy().check(normalized);
        long endDeque = System.nanoTime();
        System.out.println("Deque result: " + dequeResult + ", Time: " + (endDeque - startDeque) + " ns");

        long startRec = System.nanoTime();
        boolean recResult = RecursiveChecker.isPalindrome(normalized, 0, normalized.length() - 1);
        long endRec = System.nanoTime();
        System.out.println("Recursive result: " + recResult + ", Time: " + (endRec - startRec) + " ns");
    }
}

class StackStrategy {
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char ch : input.toCharArray()) stack.push(ch);
        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) return false;
        }
        return true;
    }
}

class DequeStrategy {
    public boolean check(String input) {
        java.util.Deque<Character> deque = new java.util.LinkedList<>();
        for (char ch : input.toCharArray()) deque.addLast(ch);
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        }
        return true;
    }
}

class RecursiveChecker {
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome(str, start + 1, end - 1);
    }
}