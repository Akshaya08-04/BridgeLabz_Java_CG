package stackqueuehash.hash;
/*
This program finds the length of the longest consecutive sequence
in an unsorted array.
HashSet is used for fast lookup of elements.
*/

import java.util.HashSet;

class longestConsecutiveSequence {

    static int findLongestSequence(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // Store all elements in HashSet
        for (int num : arr) {
            set.add(num);
        }

        int longestLength = 0;

        for (int num : arr) {

            // Check if num is the starting element of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

                // Count consecutive elements
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                // Update maximum length
                longestLength = Math.max(longestLength, currentLength);
            }
        }

        return longestLength;
    }
}
