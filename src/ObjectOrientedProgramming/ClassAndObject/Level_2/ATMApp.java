package ObjectOrientedProgramming.ClassAndObject.Level_2;
import java.util.Scanner;

class BankAccount {

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance = balance + amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance)
            balance = balance - amt;
        else
            System.out.println("Insufficient balance");
    }
}

public class ATMApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount(5000);
        // Initial balance

        System.out.print("Enter deposit amount: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter withdraw amount: ");
        acc.withdraw(sc.nextDouble());

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
