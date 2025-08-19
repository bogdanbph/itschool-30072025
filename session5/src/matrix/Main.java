package matrix;

public class Main {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] firstArray = matrix[0]; // {1, 2, 3}
        int[] secondArray = matrix[1]; // {4, 5, 6}
        int[] thirdArray = matrix[2]; // {7, 8, 9}

        // 1 2 3
        // 4 5 6
        // 7 8 9

        int firstElem = matrix[0][0]; // 1
        int otherElem = matrix[1][2]; // 6

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
        // 0. initializare i

        // 1 -> 3 repetati pana cand conditie = false
        // 1. verificare conditie intrare
        // 2. executare iteratie (orice ar in for)
        // 3. actualizare i

        // first diagonal elements within a matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
                }
            }
        }
    }

}
