package CoreProgramming.Extras.Strings;
import java.util.Scanner;

class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        if (a.length() != b.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        int[] freq = new int[256];
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }

        for (int f : freq) {
            if (f != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }

        System.out.println("Anagrams");
    }
}
