package stackqueuehash.stackqueue;
/*
This program implements a Queue using two Stacks.
One stack is used for enqueue operation.
Another stack is used for dequeue operation.
This ensures FIFO behavior using LIFO structures.
*/

import java.util.Stack;

class queueUsingStacks {

    // Stack used for enqueue operation
    Stack<Integer> stack1 = new Stack<>();

    // Stack used for dequeue operation
    Stack<Integer> stack2 = new Stack<>();

    /*
    Enqueue operation:
    Push the element into stack1.
    */
    void enqueue(int data) {
        stack1.push(data);
    }

    /*
    Dequeue operation:
    If stack2 is empty, transfer all elements from stack1 to stack2.
    Then pop the top element from stack2.
    */
    int dequeue() {

        if (stack2.isEmpty()) {

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }
}
