package CoreProgramming.ControlFlowStatements.Level_2;
import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        double heightAmar = input.nextDouble();
        double heightAkbar = input.nextDouble();
        double heightAnthony = input.nextDouble();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        System.out.println("Youngest age is " + youngestAge);
        System.out.println("Tallest height is " + tallestHeight);
    }
}
