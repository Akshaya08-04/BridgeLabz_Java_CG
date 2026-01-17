package CoreProgramming.Strings.Level_1;

import java.util.Scanner;

public class ArrayIndexExceptionDemo {

    public static void generateException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    public static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        handleException(names);
    }
}
