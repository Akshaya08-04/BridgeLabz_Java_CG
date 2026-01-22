package sorting;
/*
This program sorts salary demands using Heap Sort.
A max heap is created from the array.
The largest element is repeatedly moved to the end.
*/

class heapSortSalaries {

    static void heapSort(int[] salaries) {

        int n = salaries.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Extract elements from heap
        for (int i = n - 1; i > 0; i--) {

            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            heapify(salaries, i, 0);
        }
    }

    static void heapify(int[] salaries, int n, int root) {

        int largest = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;

        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        if (largest != root) {

            int temp = salaries[root];
            salaries[root] = salaries[largest];
            salaries[largest] = temp;

            heapify(salaries, n, largest);
        }
    }
}
