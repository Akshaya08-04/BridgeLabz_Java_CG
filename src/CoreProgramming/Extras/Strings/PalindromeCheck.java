package CoreProgramming.Extras.Strings;
import java.util.Scanner;

class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        int start = 0, end = text.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
}
