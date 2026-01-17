package CoreProgramming.Strings.Level_1;
import java.util.Scanner;

public class StringIndexExceptionDemo {

    public static void generateException(String text) {
        text.charAt(text.length());
    }

    public static void handleException(String text) {
        try {
            text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();
        handleException(text);
    }
}
