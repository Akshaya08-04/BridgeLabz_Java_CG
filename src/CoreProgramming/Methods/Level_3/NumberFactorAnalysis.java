package CoreProgramming.Methods.Level_3;

public class NumberFactorAnalysis {

    static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++)
            if (num % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++)
            if (num % i == 0) factors[index++] = i;

        return factors;
    }

    static int sumFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    static boolean isPerfect(int num) {
        return sumFactors(findFactors(num)) - num == num;
    }

    static boolean isAbundant(int num) {
        return sumFactors(findFactors(num)) - num > num;
    }

    static boolean isDeficient(int num) {
        return sumFactors(findFactors(num)) - num < num;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 28;

        System.out.println("Perfect: " + isPerfect(number));
        System.out.println("Abundant: " + isAbundant(number));
        System.out.println("Deficient: " + isDeficient(number));
        System.out.println("Strong: " + isStrong(number));
    }
}
