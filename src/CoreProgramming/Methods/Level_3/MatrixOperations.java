package CoreProgramming.Methods.Level_3;
class MatrixOperations {

    static int[][] createMatrix(int r, int c) {
        int[][] m = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int)(Math.random() * 10);
        return m;
    }

    static void display(int[][] m) {
        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    static int[][] add(int[][] a, int[][] b) {
        int[][] r = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                r[i][j] = a[i][j] + b[i][j];
        return r;
    }

    static int[][] transpose(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                t[j][i] = a[i][j];
        return t;
    }

    public static void main(String[] args) {
        int[][] a = createMatrix(2, 2);
        int[][] b = createMatrix(2, 2);

        System.out.println("Matrix A:");
        display(a);

        System.out.println("Matrix B:");
        display(b);

        System.out.println("Addition:");
        display(add(a, b));

        System.out.println("Transpose of A:");
        display(transpose(a));
    }
}
