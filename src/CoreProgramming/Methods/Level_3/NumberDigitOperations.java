package CoreProgramming.Methods.Level_3;

public class NumberDigitOperations {

    static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, 2);
        return sum;
    }

    static boolean isHarshad(int num, int[] digits) {
        return num % sumOfDigits(digits) == 0;
    }

    static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int number = 21;

        int[] digits = storeDigits(number);

        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares: " + sumOfSquares(digits));
        System.out.println("Is Harshad: " + isHarshad(number, digits));

        System.out.println("Digit Frequency:");
        int[][] freq = digitFrequency(digits);
        for (int[] f : freq)
            if (f[1] > 0)
                System.out.println(f[0] + " -> " + f[1]);
    }
}
