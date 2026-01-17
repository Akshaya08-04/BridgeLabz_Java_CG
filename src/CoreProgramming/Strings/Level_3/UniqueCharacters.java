package CoreProgramming.Strings.Level_3;
import java.util.Scanner;

class UniqueCharacters {

    static int lengthWithoutMethod(String text) {
        int len = 0;
        for (char c : text.toCharArray()) len++;
        return len;
    }

    static char[] findUnique(String text) {
        int len = lengthWithoutMethod(text);
        char[] temp = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean unique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[index++] = ch;
        }

        char[] result = new char[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = findUnique(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
    }
}
