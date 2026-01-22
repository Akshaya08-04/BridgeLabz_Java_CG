package linkedlist;
/*
 Program: Student Record Management using Singly Linked List
 Each node stores: Roll No, Name, Age, Grade
 Operations: Add, Delete, Search, Display, Update Grade
*/

class studentNode {
    int rollNo, age;
    String name, grade;
    studentNode next;

    studentNode(int rollNo, String name, int age, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentLinkedList {
    studentNode head;

    /* Add student at end */
    void addStudent(int rollNo, String name, int age, String grade) {
        studentNode newNode = new studentNode(rollNo, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        studentNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    /* Delete student by Roll Number */
    void deleteStudent(int rollNo) {
        if (head == null) return;

        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }

        studentNode temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }

    /* Search student by Roll Number */
    void searchStudent(int rollNo) {
        studentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Found: " + temp.name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    /* Update Grade */
    void updateGrade(int rollNo, String newGrade) {
        studentNode temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.grade = newGrade;
                return;
            }
            temp = temp.next;
        }
    }

    /* Display all students */
    void display() {
        studentNode temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.grade);
            temp = temp.next;
        }
    }
}
