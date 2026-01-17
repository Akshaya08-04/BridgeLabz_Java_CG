package CoreProgramming.Strings.Level_1;
import java.util.Scanner;

public class NumberFormatDemo {

    public static void generateException(String text) {
        Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        handleException(text);
    }
}
