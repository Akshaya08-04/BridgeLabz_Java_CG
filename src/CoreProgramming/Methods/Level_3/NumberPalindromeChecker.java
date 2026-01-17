package CoreProgramming.Methods.Level_3;

public class NumberPalindromeChecker {

    static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            digits[i] = s.charAt(i) - '0';
        return digits;
    }

    static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    static boolean compareArrays(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    static boolean isPalindrome(int[] digits) {
        return compareArrays(digits, reverseArray(digits));
    }

    static boolean isDuck(int[] digits) {
        for (int d : digits)
            if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 12021;
        int[] digits = storeDigits(number);

        System.out.println("Is Palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck Number: " + isDuck(digits));
    }
}
