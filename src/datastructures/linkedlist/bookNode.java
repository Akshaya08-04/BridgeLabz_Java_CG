package linkedlist;
/*
This program manages library books using a doubly linked list.
Each book node contains references to previous and next nodes.
*/

class bookNode {

    int bookId;
    String title;
    String author;
    boolean isAvailable;

    bookNode prev;
    bookNode next;

    bookNode(int bookId, String title, String author, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
}

class libraryDoublyLinkedList {

    bookNode head;
    bookNode tail;

    /*
    Adds a book to the end of the list.
    */
    void addBook(int bookId, String title, String author, boolean isAvailable) {

        bookNode newNode = new bookNode(bookId, title, author, isAvailable);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    /*
    Counts the total number of books.
    */
    void countBooks() {

        int count = 0;
        bookNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total Books = " + count);
    }
}

