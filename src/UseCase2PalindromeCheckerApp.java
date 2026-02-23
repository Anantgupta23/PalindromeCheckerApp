public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        String originalString = "madam";
        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
        }

        if (originalString.equals(reversedString)) {
            System.out.println(originalString + " is a palindrome.");
        } else {
            System.out.println(originalString + " is not a palindrome.");
        }
    }
}