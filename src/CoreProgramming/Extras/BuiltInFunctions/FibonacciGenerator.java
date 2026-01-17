package CoreProgramming.Extras.BuiltInFunctions;
import java.util.Scanner;

class FibonacciGenerator {

    static void generateFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        generateFibonacci(n);
    }
}
