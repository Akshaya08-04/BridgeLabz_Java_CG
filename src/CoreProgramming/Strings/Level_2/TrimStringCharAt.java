package CoreProgramming.Strings.Level_2;
import java.util.Scanner;

public class TrimStringCharAt {

    static int[] trimIndexes(String text) {
        int start = 0, end = text.length() - 1;
        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    static String substring(String s, int start, int end) {
        String r = "";
        for (int i = start; i < end; i++) r += s.charAt(i);
        return r;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] idx = trimIndexes(text);
        String custom = substring(text, idx[0], idx[1]);
        String builtIn = text.trim();

        System.out.println("Result Match: " + compare(custom, builtIn));
    }
}
