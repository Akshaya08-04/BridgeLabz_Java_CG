package stackqueuehash.hash;
/*
This program checks whether a pair with a given sum exists in an array.
It uses a HashMap to store visited elements.
For each element, it checks whether (target - current element) exists.
*/

import java.util.HashMap;

class pairWithGivenSum {

    static void checkPair(int[] arr, int target) {

        // HashMap stores element and its frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {

            int required = target - num;

            // Check if required value already exists
            if (map.containsKey(required)) {
                System.out.println(
                        "Pair found: " + num + " and " + required
                );
                return;
            }

            // Store current element
            map.put(num, 1);
        }

        System.out.println("No pair found with given sum");
    }
}
