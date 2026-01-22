package sorting;
/*
This program sorts product prices using Quick Sort.
A pivot element is chosen and the array is partitioned.
Elements smaller than pivot go left, larger go right.
The process is applied recursively.
*/

class quickSortProductPrices {

    static void quickSort(int[] prices, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(prices, low, high);

            // Sort left partition
            quickSort(prices, low, pivotIndex - 1);

            // Sort right partition
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    static int partition(int[] prices, int low, int high) {

        int pivot = prices[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (prices[j] < pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }
}
