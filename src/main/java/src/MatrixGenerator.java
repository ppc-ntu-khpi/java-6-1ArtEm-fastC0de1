package src;

/**
 * генерує матрицю N x M, де кожен рядок - це послідовність,
 * побудована за правилом Фібоначчі:
 * a[i][0] = 1, a[i][1] = 1,
 * a[i][j] = a[i][j-1] + a[i][j-2]
 */
public class MatrixGenerator {

    /**
     * створює матрицю заданого розміру
     *
     * @param rows кількість рядків
     * @param cols кількість стовпців
     * @return матриця з чисел Фібоначчі по рядках
     */
    public static int[][] generate(int rows, int cols) {

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            fillRow(matrix[i], cols);
        }

        return matrix;
    }

    /**
     * заповнює один рядок матриці
     */
    private static void fillRow(int[] row, int cols) {

        if (cols > 0) row[0] = 1;
        if (cols > 1) row[1] = 1;

        for (int j = 2; j < cols; j++) {
            row[j] = row[j - 1] + row[j - 2];
        }
    }
}