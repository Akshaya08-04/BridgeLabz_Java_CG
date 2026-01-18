package ObjectOrientedProgramming.ClassAndObject.Level_2;
import java.util.Scanner;
// Scanner class is used to take input from the user

class MovieTicket {
    // MovieTicket class stores ticket-related details

    String movie;
    // Variable to store movie name

    int seat;
    // Variable to store seat number

    int price;
    // Variable to store ticket price

    public MovieTicket(String movie) {
        // Constructor initializes movie name
        this.movie = movie;
        // Assigns movie name to instance variable
    }
}

public class MovieTicketApp {
    // Main class where program execution happens

    public static void book(MovieTicket t) {
        // Method to book the ticket

        t.seat = 10;
        // Assigns seat number during booking

        t.price = 200;
        // Assigns ticket price during booking
    }

    public static void display(MovieTicket t) {
        // Method to display ticket details

        System.out.println("Movie Name: " + t.movie);
        // Displays movie name

        System.out.println("Seat Number: " + t.seat);
        // Displays seat number

        System.out.println("Ticket Price: " + t.price);
        // Displays ticket price
    }

    public static void main(String[] args) {
        // Main method – program starts here

        Scanner sc = new Scanner(System.in);
        // Creating Scanner object for input

        System.out.print("Enter movie name: ");
        // Asking user to enter movie name

        String movie = sc.nextLine();
        // Reading movie name from user

        MovieTicket ticket = new MovieTicket(movie);
        // Creating MovieTicket object

        book(ticket);
        // Booking the ticket

        display(ticket);
        // Displaying booked ticket details
    }
}
