package linkedlist;
/*
This program implements a task scheduler using a circular linked list.
The last node points back to the head, forming a circular structure.
*/

class taskNode {

    int taskId;
    String taskName;
    int priority;

    // Points to the next task
    taskNode next;

    taskNode(int taskId, String taskName, int priority) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
    }
}

class taskScheduler {

    // Head points to the first task
    taskNode head;

    /*
    Adds a task to the circular linked list.
    */
    void addTask(int taskId, String taskName, int priority) {

        taskNode newNode = new taskNode(taskId, taskName, priority);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }

        taskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    /*
    Displays all tasks starting from head.
    */
    void displayTasks() {

        if (head == null) return;

        taskNode temp = head;
        do {
            System.out.println(temp.taskId + " " + temp.taskName);
            temp = temp.next;
        } while (temp != head);
    }
}
