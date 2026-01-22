package linkedlist;
/*
This program manages inventory items using a singly linked list.
Each node stores item details such as quantity and price.
*/

class itemNode {

    int itemId;
    String itemName;
    int quantity;
    double price;

    itemNode next;

    itemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }
}

class inventoryLinkedList {

    itemNode head;

    /*
    Adds an item at the beginning of the list.
    */
    void addItem(int itemId, String itemName, int quantity, double price) {

        itemNode newNode = new itemNode(itemId, itemName, quantity, price);
        newNode.next = head;
        head = newNode;
    }

    /*
    Calculates and displays total inventory value.
    */
    void calculateTotalValue() {

        double total = 0;
        itemNode temp = head;

        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }

        System.out.println("Total Inventory Value = " + total);
    }
}
