package sorting;
/*
This program sorts exam scores using Selection Sort.
In each iteration, the minimum element is selected
and swapped with the first unsorted element.
*/

class selectionSortExamScores {

    static void selectionSort(int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            // Find minimum element in remaining array
            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum element with current index
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }
}
