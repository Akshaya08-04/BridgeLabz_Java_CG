package stackqueuehash.hash;
/*
This program solves the Two Sum problem.
It returns indices of two elements whose sum equals the target.
A HashMap stores element values and their indices.
*/

import java.util.HashMap;

class twoSumProblem {

    static void findTwoSum(int[] arr, int target) {

        // HashMap stores value and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int required = target - arr[i];

            // Check if required value exists
            if (map.containsKey(required)) {
                System.out.println(
                        "Indices found: " + map.get(required) + " and " + i
                );
                return;
            }

            // Store current value with index
            map.put(arr[i], i);
        }

        System.out.println("No two sum solution found");
    }
}
