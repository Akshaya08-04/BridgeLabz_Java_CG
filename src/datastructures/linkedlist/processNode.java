package linkedlist;

/*
This program simulates round robin CPU scheduling using a circular linked list.
Each process gets CPU time in a cyclic order.
*/

class processNode {

    int processId;
    int burstTime;

    processNode next;

    processNode(int processId, int burstTime) {
        this.processId = processId;
        this.burstTime = burstTime;
    }
}

class roundRobinScheduler {

    processNode head;

    /*
    Adds a process to the circular queue.
    */
    void addProcess(int processId, int burstTime) {

        processNode newNode = new processNode(processId, burstTime);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        processNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }
}
