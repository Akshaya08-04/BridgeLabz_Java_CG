package CoreProgramming.Methods.Level_2;

import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            data[i][2] = weight / (height * height);
        }
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = sc.nextDouble();

            System.out.print("Enter height (meters) of person " + (i + 1) + ": ");
            persons[i][1] = sc.nextDouble();
        }

        calculateBMI(persons);

        System.out.println("\nBMI Report:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) +
                    " BMI: " + persons[i][2] +
                    " Status: " + getBMIStatus(persons[i][2]));
        }
    }
}
