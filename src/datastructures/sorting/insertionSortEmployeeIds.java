package sorting;
/*
This program sorts employee IDs using Insertion Sort.
The array is divided into sorted and unsorted parts.
Elements from the unsorted part are inserted into
their correct position in the sorted part.
*/

class insertionSortEmployeeIds {

    static void insertionSort(int[] ids) {

        for (int i = 1; i < ids.length; i++) {

            int key = ids[i];
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Insert key at correct position
            ids[j + 1] = key;
        }
    }
}
