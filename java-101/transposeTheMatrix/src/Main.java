public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] transposeMatrix = new int[matrix[0].length][matrix.length];

        System.out.println("Matrix: ");
        printArray(matrix);
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose Matrix: ");
        printArray(transposeMatrix);

    }

    private static void printArray(int[][] arr) {
        for (int[] line : arr) {
            for (int item : line) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}