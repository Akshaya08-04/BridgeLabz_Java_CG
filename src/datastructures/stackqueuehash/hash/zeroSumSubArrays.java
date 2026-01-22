package stackqueuehash.hash;
/*
This program finds all subarrays whose sum is equal to zero.
It uses a HashMap to store cumulative sums and their indices.
If the same cumulative sum appears again, the elements between
those indices form a zero-sum subarray.
*/

import java.util.HashMap;
import java.util.ArrayList;

class zeroSumSubarrays {

    static void findSubarrays(int[] arr) {

        // HashMap stores cumulative sum and list of indices
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        // Initial sum 0 at index -1 to handle subarrays from start
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        map.put(0, list);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            // Update cumulative sum
            sum += arr[i];

            // If sum already exists, zero-sum subarray found
            if (map.containsKey(sum)) {

                for (int startIndex : map.get(sum)) {
                    System.out.println(
                            "Zero sum subarray found from index " +
                                    (startIndex + 1) + " to " + i
                    );
                }

                map.get(sum).add(i);
            } else {

                // Store sum with current index
                ArrayList<Integer> newList = new ArrayList<>();
                newList.add(i);
                map.put(sum, newList);
            }
        }
    }
}
