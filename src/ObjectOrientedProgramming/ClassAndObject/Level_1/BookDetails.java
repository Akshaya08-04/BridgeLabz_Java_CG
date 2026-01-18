package ObjectOrientedProgramming.ClassAndObject.Level_1;
import java.util.Scanner;

class Book {
    // Book data class

    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        // Constructor
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        // Getter for title
        return title;
    }

    public String getAuthor() {
        // Getter for author
        return author;
    }

    public double getPrice() {
        // Getter for price
        return price;
    }
}

public class BookDetails {

    public static void display(Book b) {
        // Display method
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: " + b.getPrice());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter author: ");
        String author = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Book book = new Book(title, author, price);
        // Create Book object

        display(book);
    }
}
