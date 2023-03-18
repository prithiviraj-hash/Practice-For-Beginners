import java.util.Scanner;

public class AdjointMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        // Read input matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int[] row : matrix) {
            for (int i = 0; i < row.length; i++) {
                row[i] = scanner.nextInt();
            }
        }

        // Calculate adjoint matrix
        int[][] adjointMatrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int row1 = (i + 1) % 3;
                int row2 = (i + 2) % 3;
                int col1 = (j + 1) % 3;
                int col2 = (j + 2) % 3;
                adjointMatrix[j][i] = matrix[row1][col1] * matrix[row2][col2] - matrix[row1][col2] * matrix[row2][col1];
            }
        }

        // Print adjoint matrix
        System.out.println("The adjoint matrix is:");
        for (int[] row : adjointMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
