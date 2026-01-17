package CoreProgramming.Strings.Level_2;
public class StudentVoting {

    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = (int)(Math.random() * 60);
        return ages;
    }

    static String[][] votingStatus(int[] ages) {
        String[][] data = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            data[i][0] = String.valueOf(ages[i]);
            data[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return data;
    }

    static void display(String[][] data) {
        System.out.println("Age\tCanVote");
        for (String[] r : data)
            System.out.println(r[0] + "\t" + r[1]);
    }

    public static void main(String[] args) {
        display(votingStatus(generateAges(10)));
    }
}
