package ObjectOrientedProgramming.ClassAndObject.Level_1;
import java.util.Scanner;

class MobilePhone {
    // Mobile data class

    String brand;
    String model;
    double price;

    public MobilePhone(String brand, String model, double price) {
        // Constructor
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
}

public class MobileDetails {

    public static void display(MobilePhone m) {
        // Display details
        System.out.println("Brand: " + m.brand);
        System.out.println("Model: " + m.model);
        System.out.println("Price: " + m.price);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        MobilePhone phone = new MobilePhone(brand, model, price);
        display(phone);
    }
}
