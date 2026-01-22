package sorting;
/*
This program sorts student ages using Counting Sort.
It is efficient when the range of values is small.
Frequency of each age is counted and reconstructed.
*/

class countingSortStudentAges {

    static void countingSort(int[] ages) {

        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;
        int[] count = new int[range];

        // Count frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        int index = 0;

        // Rebuild sorted array
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                ages[index++] = i + minAge;
                count[i]--;
            }
        }
    }
}
