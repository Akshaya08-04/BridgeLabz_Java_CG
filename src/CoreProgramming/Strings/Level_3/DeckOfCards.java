package CoreProgramming.Strings.Level_3;
import java.util.Scanner;

class DeckOfCards {

    static String[] initializeDeck(String[] suits, String[] ranks) {
        int index = 0;
        String[] deck = new String[suits.length * ranks.length];

        for (String suit : suits)
            for (String rank : ranks)
                deck[index++] = rank + " of " + suit;

        return deck;
    }

    static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomIndex = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    static String[][] distributeCards(String[] deck, int players, int cards) {
        if (players * cards > deck.length) {
            System.out.println("Not enough cards to distribute");
            return null;
        }

        String[][] result = new String[players][cards];
        int index = 0;

        for (int i = 0; i < players; i++)
            for (int j = 0; j < cards; j++)
                result[i][j] = deck[index++];

        return result;
    }

    static void displayPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + ":");
            for (String card : players[i])
                System.out.println(card);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
        };

        String[] deck = initializeDeck(suits, ranks);
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cards = sc.nextInt();

        String[][] result = distributeCards(deck, players, cards);
        if (result != null)
            displayPlayers(result);
    }
}
