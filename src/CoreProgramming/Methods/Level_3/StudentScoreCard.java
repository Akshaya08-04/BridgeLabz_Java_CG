package CoreProgramming.Methods.Level_3;
class StudentScorecard {

    static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 100);
            marks[i][1] = (int)(Math.random() * 100);
            marks[i][2] = (int)(Math.random() * 100);
        }
        return marks;
    }

    static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            double total = marks[i][0] + marks[i][1] + marks[i][2];
            result[i][0] = total;
            result[i][1] = Math.round((total / 3) * 100.0) / 100.0;
            result[i][2] = Math.round((total / 300 * 100) * 100.0) / 100.0;
        }
        return result;
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] marks = generateMarks(students);
        double[][] result = calculateResults(marks);

        System.out.println("P\tC\tM\tTotal\tAvg\t%");
        for (int i = 0; i < students; i++) {
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t" +
                    marks[i][2] + "\t" + result[i][0] + "\t" +
                    result[i][1] + "\t" + result[i][2]);
        }
    }
}
