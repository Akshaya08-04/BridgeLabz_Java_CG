package CoreProgramming.Extras.BuiltInFunctions;
import java.util.Scanner;

class MaximumOfThree {

    static int findMax(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println("Maximum is: " + findMax(a, b, c));
    }
}
