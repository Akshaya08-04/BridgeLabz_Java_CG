package CoreProgramming.ProgrammingElements.Level_2;
import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int chocolates = input.nextInt();
        int children = input.nextInt();

        int each = chocolates / children;
        int remaining = chocolates % children;

        System.out.println("The number of chocolates each child gets is " +
                each + " and the number of remaining chocolates are " + remaining);
    }
}
