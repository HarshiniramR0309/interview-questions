
public class Matrix{
    public static void main(String[] args) {
        // Manually define two 2x2 matrices
        int[][] A = {{1, 2, 6}, {3, 4, 3},{5, 6, 8}};
        int[][] B = {{5, 6, 9},{7, 8, 7},{5, 7, 8}};

        // Resultant matrix (2x2)
        int[][] result = new int[3][3];

        // Multiply matrices
        for (int i = 0; i < 3; i++) {         // rows of A
            for (int j = 0; j < 3; j++) {     // cols of B
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) { // shared dimension
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display the result
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}