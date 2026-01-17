package CoreProgramming.Extras.Strings;
import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--)
            reverse += text.charAt(i);

        System.out.println("Reversed String: " + reverse);
    }
}
