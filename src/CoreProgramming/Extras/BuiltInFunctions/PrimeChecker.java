package CoreProgramming.Extras.BuiltInFunctions;
import java.util.Scanner;

class PrimeChecker {

    static boolean isPrime(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++)
            if (num % i == 0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(isPrime(num) ? "Prime Number" : "Not a Prime Number");
    }
}
