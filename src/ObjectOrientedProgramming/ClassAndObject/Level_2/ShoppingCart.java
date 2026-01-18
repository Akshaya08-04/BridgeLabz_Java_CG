package ObjectOrientedProgramming.ClassAndObject.Level_2;
class CartItem {
    // CartItem class stores shopping cart item details

    int price;
    // Variable to store price of one item

    int quantity;
    // Variable to store quantity of items

    public CartItem(int price, int quantity) {
        // Constructor initializes price and quantity

        this.price = price;
        // Assigns price to instance variable

        this.quantity = quantity;
        // Assigns quantity to instance variable
    }
}

public class ShoppingCart {
    // Main class for shopping cart operations

    public static void total(CartItem c) {
        // Method to calculate and display total cost

        int totalCost = c.price * c.quantity;
        // Calculates total cost

        System.out.println("Total Cost: " + totalCost);
        // Displays total cost
    }

    public static void main(String[] args) {
        // Main method – execution starts here

        CartItem item = new CartItem(50, 3);
        // Creating CartItem object with price and quantity

        total(item);
        // Calling total cost method
    }
}
