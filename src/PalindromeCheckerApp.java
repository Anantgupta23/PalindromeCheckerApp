import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String originalString = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < originalString.length(); i++) {
            deque.add(originalString.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Original string: " + originalString);

        if (isPalindrome) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }
        }
    }
}