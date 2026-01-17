package CoreProgramming.Strings.Level_1;
import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void generateException(String text) {
        text.substring(5, 2);
    }

    public static void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();

        handleException(text);
    }
}
