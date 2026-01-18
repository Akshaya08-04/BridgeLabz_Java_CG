package ObjectOrientedProgramming.ClassAndObject.Level_1;
import java.util.Scanner;

class Item {
    // Item data class

    int code;
    String name;
    double price;

    public Item(int code, String name, double price) {
        // Constructor
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        // Getter for price
        return price;
    }
}

public class ItemDetails {

    public static void totalCost(Item i, int qty) {
        // Calculate total cost
        System.out.println("Total Cost: " + (i.getPrice() * qty));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item code: ");
        int code = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter item name: ");
        String name = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        Item item = new Item(code, name, price);
        // Create Item object

        totalCost(item, qty);
        // Call cost method
    }
}
