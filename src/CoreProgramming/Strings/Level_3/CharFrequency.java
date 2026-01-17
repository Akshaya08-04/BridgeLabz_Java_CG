package CoreProgramming.Strings.Level_3;
import java.util.Scanner;

class CharFrequency {

    static String[][] frequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        String[][] result = new String[text.length()][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] result = frequency(text);
        for (String[] row : result)
            if (row[0] != null)
                System.out.println(row[0] + " -> " + row[1]);
    }
}
