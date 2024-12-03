class Solution {
    public int[][] transpose(int[][] matrix) {
        // Create a new matrix for the transposed result
        int rows = matrix.length; // Number of rows in the original matrix
        int cols = matrix[0].length; // Number of columns in the original matrix
        int[][] transposed = new int[cols][rows];

        // Transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }
}

class transposematrix {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};

        // Call the transpose method
        int[][] result = solution.transpose(matrix);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int[] row : result) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
