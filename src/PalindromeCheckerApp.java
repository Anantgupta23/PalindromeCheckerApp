import java.util.Scanner;

public class PalindromeCheckerApp  {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String reversed = new StringBuilder(input).reverse().toString();
            if (input.equals(reversed)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
            sc.close();
        }
    }

