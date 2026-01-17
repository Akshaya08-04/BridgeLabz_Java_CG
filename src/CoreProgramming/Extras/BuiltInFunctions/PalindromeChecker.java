package CoreProgramming.Extras.BuiltInFunctions;
import java.util.Scanner;

class PalindromeChecker {

    static boolean isPalindrome(String text) {
        int start = 0, end = text.length() - 1;

        while (start < end)
            if (text.charAt(start++) != text.charAt(end--))
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println(isPalindrome(text) ? "Palindrome" : "Not a Palindrome");
    }
}
