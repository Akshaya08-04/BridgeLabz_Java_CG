package CoreProgramming.ControlFlowStatements.Level_1;
import java.util.Scanner;

public class SumUntilBreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0.0;

        while (true) {
            double value = input.nextDouble();
            if (value <= 0)
                break;
            total += value;
        }
        System.out.println("Total sum is " + total);
    }
}
