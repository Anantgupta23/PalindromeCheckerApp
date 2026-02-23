public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String originalString = "madam";

        // Variable to store the reversed string
        String reversedString = "";

        // Reverse the string
        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }

        // Check if the original string equals the reversed string
        if (originalString.equals(reversedString)) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
    }

