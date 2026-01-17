package CoreProgramming.Extras.Strings;
import java.util.Scanner;

class RemoveSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char remove = sc.next().charAt(0);

        String result = "";
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) != remove)
                result += text.charAt(i);

        System.out.println("Modified String: " + result);
    }
}
