package stackqueuehash.hash;
/*
This program implements a custom HashMap.
It uses an array of linked lists to handle collisions.
Operations supported: put, get, remove.
*/

class customHashMap {

    // Node class for linked list
    class node {
        int key;
        int value;
        node next;

        node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 10;
    private node[] table;

    // Constructor initializes hash table
    customHashMap() {
        table = new node[size];
    }

    /*
    Inserts a key-value pair into the hash map.
    */
    void put(int key, int value) {

        int index = key % size;
        node head = table[index];

        // Check if key already exists
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new node at beginning
        node newNode = new node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    /*
    Retrieves value associated with a key.
    */
    int get(int key) {

        int index = key % size;
        node head = table[index];

        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return -1;
    }

    /*
    Removes a key-value pair from the hash map.
    */
    void remove(int key) {

        int index = key % size;
        node head = table[index];
        node prev = null;

        while (head != null) {

            if (head.key == key) {
                if (prev == null) {
                    table[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }

            prev = head;
            head = head.next;
        }
    }
}
