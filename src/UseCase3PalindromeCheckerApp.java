public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        String originalString = "madam";
        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + originalString.charAt(i);
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