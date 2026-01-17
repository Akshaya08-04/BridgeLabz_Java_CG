package CoreProgramming.ProgrammingElements.Level_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + num1 + " and " + num2 + " is "
                + (num1 + num2) + ", "
                + (num1 - num2) + ", "
                + (num1 * num2) + ", "
                + (num1 / num2));
    }
}

