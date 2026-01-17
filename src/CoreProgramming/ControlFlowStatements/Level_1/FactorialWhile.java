package CoreProgramming.ControlFlowStatements.Level_1;
import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n > 0) {
            int fact = 1;
            while (n > 0) {
                fact *= n;
                n--;
            }
            System.out.println("Factorial is " + fact);
        }
    }
}
