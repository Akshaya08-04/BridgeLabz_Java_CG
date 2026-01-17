package CoreProgramming.Methods.Level_3;

public class FootballTeamHeight {

    static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // 150–250
        }
        return heights;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }

    static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    static int shortest(int[] arr) {
        int min = arr[0];
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    static int tallest(int[] arr) {
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();

        System.out.print("Heights: ");
        for (int h : heights) System.out.print(h + " ");

        System.out.println("\nShortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
        System.out.println("Mean Height: " + mean(heights));
    }
}
