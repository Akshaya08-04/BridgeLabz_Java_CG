package CoreProgramming.Strings.Level_3;
import java.util.Scanner;

class BMICalculator {

    static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100;
            double bmi = weight / (heightM * heightM);

            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getBMIStatus(bmi);
        }
        return result;
    }

    static void display(String[][] result) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight and height for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        display(calculateBMI(data));
    }
}
