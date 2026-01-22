package linkedlist;
/*
This program manages ticket reservations using a circular linked list.
All booked tickets are connected in a circular manner.
*/

class ticketNode {

    int ticketId;
    String customerName;

    ticketNode next;

    ticketNode(int ticketId, String customerName) {
        this.ticketId = ticketId;
        this.customerName = customerName;
    }
}

class ticketReservationSystem {

    ticketNode head;

    /*
    Books a new ticket.
    */
    void bookTicket(int ticketId, String customerName) {

        ticketNode newNode = new ticketNode(ticketId, customerName);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        ticketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }
}
