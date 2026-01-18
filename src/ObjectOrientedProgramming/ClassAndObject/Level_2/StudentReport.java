package ObjectOrientedProgramming.ClassAndObject.Level_2;
import java.util.Scanner;

class Student {

    String name;
    int roll;
    int marks;

    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class StudentReport {

    public static void display(Student s) {

        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.roll);

        if (s.getMarks() >= 50)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        Student student = new Student(name, roll, marks);
        display(student);
    }
}
