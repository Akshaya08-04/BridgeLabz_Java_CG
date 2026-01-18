package ObjectOrientedProgramming.ClassAndObject.Level_2;
import java.util.Scanner;

class Palindrome {

    String text;

    public Palindrome(String text) {
        this.text = text;
    }
}

public class PalindromeCheck {

    public static void check(Palindrome p) {

        String rev = "";
        // Variable to store reverse string

        for (int i = p.text.length() - 1; i >= 0; i--) {
            rev = rev + p.text.charAt(i);
        }

        if (p.text.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        Palindrome p = new Palindrome(text);
        check(p);
    }
}
