package CoreProgramming.ProgrammingElements.Level_2;

import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();

        double distance1 = input.nextDouble();
        double distance2 = input.nextDouble();
        double time = input.nextDouble();

        double totalDistance = distance1 + distance2;
        double speed = totalDistance / time;

        System.out.println("Name: " + name +
                "\nFrom: " + fromCity +
                "\nVia: " + viaCity +
                "\nTo: " + toCity +
                "\nTotal Distance: " + totalDistance +
                "\nSpeed: " + speed);
    }
}
