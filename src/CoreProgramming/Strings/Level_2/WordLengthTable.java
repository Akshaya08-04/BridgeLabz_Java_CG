package CoreProgramming.Strings.Level_2;
import java.util.Scanner;

public class WordLengthTable {

    static int stringLength(String s) {
        int i = 0;
        try { while (true) s.charAt(i++); }
        catch (Exception e) { return i; }
    }

    static String[] splitWords(String text) {
        int len = stringLength(text), wc = 1;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') wc++;

        String[] words = new String[wc];
        int start = 0, idx = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++) w += text.charAt(j);
                words[idx++] = w;
                start = i + 1;
            }
        }
        return words;
    }

    static String[][] wordLength2D(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(stringLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] table = wordLength2D(splitWords(text));

        System.out.println("Word\tLength");
        for (String[] row : table)
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
    }
}

