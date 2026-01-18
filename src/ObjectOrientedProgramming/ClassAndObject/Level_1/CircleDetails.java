package ObjectOrientedProgramming.ClassAndObject.Level_1;
import java.util.Scanner;

class Circle { // Circle class
    double radius; // Radius variable

    public Circle(double radius) { // Constructor
        this.radius = radius;
    }

    public double getRadius() { // Getter
        return radius;
    }
}

public class CircleDetails {
    public static void display(Circle c) { // Display method
        System.out.println("Area: " + (3.14 * c.getRadius() * c.getRadius()));
        System.out.println("Circumference: " + (2 * 3.14 * c.getRadius()));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        Circle c = new Circle(r);
        display(c);
    }
}
