package stackqueuehash.stackqueue;
/*
This program finds the maximum element in each sliding window of size k.
A deque is used to store indices of useful elements.
*/

import java.util.Deque;
import java.util.LinkedList;

class slidingWindowMaximum {

    static void findMaximum(int[] arr, int k) {

        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offerLast(i);

            // Print maximum for current window
            if (i >= k - 1) {
                System.out.println("Window ending at index " + i +
                        " Max = " + arr[deque.peekFirst()]);
            }
        }
    }
}
