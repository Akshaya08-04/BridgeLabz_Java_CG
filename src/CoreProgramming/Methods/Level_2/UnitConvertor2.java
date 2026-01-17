package CoreProgramming.Methods.Level_2;
import java.util.Scanner;

public class UnitConvertor2 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = sc.nextDouble();
        System.out.println("Feet = " + convertYardsToFeet(yards));

        System.out.print("Enter meters: ");
        double meters = sc.nextDouble();
        System.out.println("Inches = " + convertMetersToInches(meters));

        System.out.print("Enter inches: ");
        double inches = sc.nextDouble();
        System.out.println("Centimeters = " + convertInchesToCm(inches));
    }
}
