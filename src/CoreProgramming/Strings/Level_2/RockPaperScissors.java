package CoreProgramming.Strings.Level_2;
import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        String[] c = {"rock", "paper", "scissors"};
        return c[(int)(Math.random() * 3)];
    }

    static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWin = 0, compWin = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next();
            String comp = computerChoice();

            int result = winner(user, comp);
            if (result == 1) userWin++;
            else if (result == -1) compWin++;

            System.out.println("Computer: " + comp);
        }

        System.out.println("\nUser Wins: " + userWin);
        System.out.println("Computer Wins: " + compWin);
        System.out.println("User Win %: " + (userWin * 100.0 / games));
    }
}
