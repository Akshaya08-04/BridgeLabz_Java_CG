package sorting;
/*
This program sorts student marks using Bubble Sort.
Bubble Sort repeatedly compares adjacent elements.
If elements are in the wrong order, they are swapped.
The process continues until the array is fully sorted.
*/

class bubbleSortStudentMarks {

    static void bubbleSort(int[] marks) {

        int n = marks.length;

        // Outer loop controls number of passes
        for (int i = 0; i < n - 1; i++) {

            // Inner loop compares adjacent elements
            for (int j = 0; j < n - 1 - i; j++) {

                // Swap if current element is greater than next
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }
}
