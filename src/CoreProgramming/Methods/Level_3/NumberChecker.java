package CoreProgramming.Methods.Level_3;

public class NumberChecker {

    static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0) return true;
        return false;
    }

    static boolean isArmstrong(int num, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int d : digits)
            sum += Math.pow(d, power);
        return sum == num;
    }

    static void largestAndSecond(int[] digits) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > max) {
                second = max;
                max = d;
            } else if (d > second && d != max) {
                second = d;
            }
        }
        System.out.println("Largest: " + max + ", Second Largest: " + second);
    }

    static void smallestAndSecond(int[] digits) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < min) {
                second = min;
                min = d;
            } else if (d < second && d != min) {
                second = d;
            }
        }
        System.out.println("Smallest: " + min + ", Second Smallest: " + second);
    }
}
