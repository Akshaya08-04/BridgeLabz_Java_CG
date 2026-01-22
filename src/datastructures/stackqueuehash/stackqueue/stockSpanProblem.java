package stackqueuehash.stackqueue;
/*
This program solves the Stock Span Problem using a stack.
For each day, it calculates how many consecutive previous days
had a stock price less than or equal to the current price.
*/

import java.util.Stack;

class stockSpanProblem {

    static void calculateSpan(int[] price) {

        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {

            // Remove elements smaller than current price
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? i + 1 : i - stack.peek();

            // Push current index
            stack.push(i);
        }

        // Display span values
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + i + " Span = " + span[i]);
        }
    }
}
