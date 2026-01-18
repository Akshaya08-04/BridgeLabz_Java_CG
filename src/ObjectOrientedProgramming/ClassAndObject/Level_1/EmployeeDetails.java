package ObjectOrientedProgramming.ClassAndObject.Level_1;
import java.util.Scanner; // Imports Scanner class

class Employee { // Employee data class
    String name;     // Employee name
    String id;       // Employee ID
    double salary;   // Employee salary

    public Employee(String name, String id, double salary) { // Constructor
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() { // Getter for name
        return name;
    }

    public String getId() { // Getter for ID
        return id;
    }

    public double getSalary() { // Getter for salary
        return salary;
    }
}

public class EmployeeDetails { // Main class
    public static void display(Employee e) { // Method to display details
        System.out.println("Name: " + e.getName());
        System.out.println("ID: " + e.getId());
        System.out.println("Salary: " + e.getSalary());
    }

    public static void main(String[] args) { // Main method
        Scanner sc = new Scanner(System.in); // Scanner object

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(name, id, salary); // Object creation
        display(e); // Method call
    }
}
