package CoreProgramming.Extras.Strings;
import java.util.Scanner;

class CompareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        int min = Math.min(s1.length(), s2.length());
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println(
                        s1.charAt(i) < s2.charAt(i) ?
                                s1 + " comes before " + s2 :
                                s2 + " comes before " + s1
                );
                return;
            }
        }
        System.out.println(
                s1.length() < s2.length() ?
                        s1 + " comes before " + s2 :
                        s2 + " comes before " + s1
        );
    }
}
