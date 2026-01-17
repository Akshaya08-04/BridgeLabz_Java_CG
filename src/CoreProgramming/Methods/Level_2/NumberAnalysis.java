package CoreProgramming.Methods.Level_2;
import java.util.Scanner;

public class NumberAnalysis {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                if (isEven(arr[i]))
                    System.out.println("Positive Even");
                else
                    System.out.println("Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(arr[0], arr[4]);
        if (result == 1)
            System.out.println("First element is greater");
        else if (result == 0)
            System.out.println("First and last are equal");
        else
            System.out.println("First element is less");
    }
}
