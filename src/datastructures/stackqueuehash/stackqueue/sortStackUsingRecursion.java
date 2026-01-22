package stackqueuehash.stackqueue;
/*
This program sorts a stack using recursion.
No extra data structure is used.
*/

import java.util.Stack;

class sortStackUsingRecursion {

    /*
    Sorts the entire stack recursively.
    */
    static void sortStack(Stack<Integer> stack) {

        if (!stack.isEmpty()) {

            // Remove the top element
            int temp = stack.pop();

            // Sort remaining stack
            sortStack(stack);

            // Insert the element at correct position
            insertSorted(stack, temp);
        }
    }

    /*
    Inserts an element into the stack in sorted order.
    */
    static void insertSorted(Stack<Integer> stack, int element) {

        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int temp = stack.pop();
        insertSorted(stack, element);
        stack.push(temp);
    }
}
