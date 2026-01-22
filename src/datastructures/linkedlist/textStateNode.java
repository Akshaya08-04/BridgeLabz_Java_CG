package linkedlist;
/*
This program implements undo and redo functionality using a doubly linked list.
Each node represents a state of text.
*/

class textStateNode {

    String text;

    textStateNode prev;
    textStateNode next;

    textStateNode(String text) {
        this.text = text;
    }
}

class undoRedoManager {

    textStateNode current;

    /*
    Adds a new text state.
    */
    void addState(String text) {

        textStateNode newNode = new textStateNode(text);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }

        current = newNode;
    }

    /*
    Moves to the previous state.
    */
    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    /*
    Moves to the next state.
    */
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }
}
