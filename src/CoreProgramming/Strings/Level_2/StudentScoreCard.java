package CoreProgramming.Strings.Level_2;
public class StudentScoreCard {

    static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return marks;
    }

    static double[][] calculateScores(int[][] marks) {
        double[][] scores = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            scores[i][0] = total;
            scores[i][1] = Math.round(avg * 100.0) / 100.0;
            scores[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return scores;
    }

    static String[] calculateGrade(double[][] scores) {
        String[] grades = new String[scores.length];
        for (int i = 0; i < scores.length; i++) {
            double p = scores[i][2];
            if (p >= 80) grades[i] = "A";
            else if (p >= 70) grades[i] = "B";
            else if (p >= 60) grades[i] = "C";
            else if (p >= 50) grades[i] = "D";
            else if (p >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    static void displayScoreCard(int[][] marks, double[][] scores, String[] grades) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            marks[i][0] + "\t" +
                            marks[i][1] + "\t" +
                            marks[i][2] + "\t" +
                            (int)scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            grades[i]
            );
        }
    }

    public static void main(String[] args) {
        int students = 5;

        int[][] marks = generateMarks(students);
        double[][] scores = calculateScores(marks);
        String[] grades = calculateGrade(scores);

        displayScoreCard(marks, scores, grades);
    }
}
