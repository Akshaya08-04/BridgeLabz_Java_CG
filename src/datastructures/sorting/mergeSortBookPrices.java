package sorting;
/*
This program sorts book prices using Merge Sort.
Merge Sort divides the array into halves recursively.
Each half is sorted and then merged into a final array.
*/

class mergeSortBookPrices {

    static void mergeSort(int[] prices, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(prices, left, mid);

            // Sort right half
            mergeSort(prices, mid + 1, right);

            // Merge both halves
            merge(prices, left, mid, right);
        }
    }

    static void merge(int[] prices, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = prices[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = prices[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge the arrays
        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                prices[k++] = leftArray[i++];
            } else {
                prices[k++] = rightArray[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            prices[k++] = leftArray[i++];
        }

        while (j < n2) {
            prices[k++] = rightArray[j++];
        }
    }
}
