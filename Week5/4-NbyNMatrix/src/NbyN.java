public class NbyN {
    public static int[][] nbyn(int N) {
        int[][] matrix = new int[N][N];
        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (row == col) {
                    matrix[row][col] = row;
                } else {
                    matrix[row][col] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = nbyn(10);
        for (int row = 0; row < 10; row++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.print("\n");
        }
    }
}
