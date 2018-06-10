package dynamic.programming;

public class MaxSequence {

    public int MaxSequenceLength(char[] seq1, char[] seq2) {
        int matrixSize = Math.max(seq1.length, seq2.length);
        int[][] matrix = new int[matrixSize + 1][matrixSize + 1];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 0;
                } else if (seq1[i] == seq2[j]) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                } else {
                    matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                }
                print(matrix);
            }
        }
        return matrix[seq1.length][seq2.length];
    }

    private void print(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (j % x.length == 0) {
                    System.out.println();
                }
                System.out.print(x[i][j]);
            }
        }
        System.out.println();

    }
}
