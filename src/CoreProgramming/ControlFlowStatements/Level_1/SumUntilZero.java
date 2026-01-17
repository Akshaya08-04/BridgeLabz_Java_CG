package CoreProgramming.ControlFlowStatements.Level_1;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;

        while ((value = input.nextDouble()) != 0) {
            total += value;
        }

        System.out.println("Total sum is " + total);
    }
}
