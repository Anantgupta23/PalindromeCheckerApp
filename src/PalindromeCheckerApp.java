public class PalindromeCheckerApp {
    public static void main(String[] args) {
            String originalString = "madam";
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < originalString.length(); i++) {
                stack.push(originalString.charAt(i));
            }

            String reversedString = "";
            while (!stack.isEmpty()) {
                reversedString = reversedString + stack.pop();
            }

            System.out.println("Original string: " + originalString);
            System.out.println("Reversed string: " + reversedString);

            if (originalString.equals(reversedString)) {
                System.out.println(originalString + " is a palindrome.");
            } else {
                System.out.println(originalString + " is not a palindrome.");
        }
    }
}