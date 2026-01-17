package CoreProgramming.ControlFlowStatements.Level_2;
import java.util.Scanner;

public class MutliplesBelow100For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0 && number < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0)
                    System.out.println(i);
            }
        }
    }
}
