package stackqueuehash.stackqueue;
/*
This program solves the Circular Tour Problem.
It determines the starting petrol pump index
from which a complete circular tour is possible.
*/

class circularTourProblem {

    static int findStartingPoint(int[] petrol, int[] distance) {

        int start = 0;
        int balance = 0;
        int deficit = 0;

        for (int i = 0; i < petrol.length; i++) {

            // Calculate current balance
            balance += petrol[i] - distance[i];

            // If balance becomes negative
            if (balance < 0) {
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }

        // Check if total petrol is sufficient
        if (balance + deficit >= 0) {
            return start;
        } else {
            return -1;
        }
    }
}
