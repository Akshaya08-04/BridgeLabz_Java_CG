package CoreProgramming.Strings.Level_2;
import java.util.Scanner;

public class ShortestLongestWord {

    static int[] findShortestLongest(String[][] data) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int minIdx = 0, maxIdx = 0;

        for (int i = 0; i < data.length; i++) {
            int len = Integer.parseInt(data[i][1]);
            if (len < min) { min = len; minIdx = i; }
            if (len > max) { max = len; maxIdx = i; }
        }
        return new int[]{minIdx, maxIdx};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] table = WordLengthTable.wordLength2D(
                WordLengthTable.splitWords(text));

        int[] result = findShortestLongest(table);

        System.out.println("Shortest: " + table[result[0]][0]);
        System.out.println("Longest: " + table[result[1]][0]);
    }
}
