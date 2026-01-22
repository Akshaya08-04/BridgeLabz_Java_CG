package linkedlist;
/*
 Program Name: Movie Management System
 Data Structure Used: Doubly Linked List
 Description:
 - Each movie is stored as a node
 - Each node contains movie details and two links
 - prev → points to previous node
 - next → points to next node
*/

/* Node class to store movie details */
class movieNode {

    // Movie attributes
    String title;
    String director;
    int year;
    double rating;

    // Pointers for doubly linked list
    movieNode prev;
    movieNode next;

    // Constructor to initialize movie details
    movieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}

/* Doubly Linked List class */
class movieDoublyLinkedList {

    // Head points to first node
    movieNode head;

    // Tail points to last node
    movieNode tail;

    /*
     Method Name: addMovie
     Purpose: Add a movie at the end of the list
     Time Complexity: O(1)
    */
    void addMovie(String title, String director, int year, double rating) {

        // Create new movie node
        movieNode newNode = new movieNode(title, director, year, rating);

        // If list is empty, set head and tail
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Link new node after tail
        tail.next = newNode;
        newNode.prev = tail;

        // Update tail
        tail = newNode;
    }

    /*
     Method Name: displayForward
     Purpose: Display movies from head to tail
    */
    void displayForward() {

        // Temporary node for traversal
        movieNode temp = head;

        // Traverse until end of list
        while (temp != null) {
            System.out.println(
                    "Title: " + temp.title +
                            ", Director: " + temp.director +
                            ", Rating: " + temp.rating
            );
            temp = temp.next;
        }
    }

    /*
     Method Name: displayReverse
     Purpose: Display movies from tail to head
    */
    void displayReverse() {

        // Start traversal from tail
        movieNode temp = tail;

        // Traverse backward using prev pointer
        while (temp != null) {
            System.out.println("Title: " + temp.title);
            temp = temp.prev;
        }
    }
}
