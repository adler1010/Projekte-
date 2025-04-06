public class Sudoku {

    public static void main(String[] args) {
        int[][] validSudoku = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        int[][] invalidSudoku = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 2, 9} // Ungültig: Wiederholung der Zahl 2
        };

        System.out.println("Valid Sudoku: " + isValidSudokuSolution(validSudoku));
        System.out.println("Invalid Sudoku: " + isValidSudokuSolution(invalidSudoku));
    }

    public static boolean isValidSudokuSolution(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            if (!isRowValid(sudoku, i) || !isColumnValid(sudoku, i) || !isBoxValid(sudoku, i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isRowValid(int[][] sudoku, int row) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (!checkNumber(sudoku[row][i], seen)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isColumnValid(int[][] sudoku, int column) {
        boolean[] seen = new boolean[9];
        for (int i = 0; i < 9; i++) {
            if (!checkNumber(sudoku[i][column], seen)) {
                return false;
            }
        }
        return true;
    }

    private static boolean isBoxValid(int[][] sudoku, int box) {
        boolean[] seen = new boolean[9];
        int rowStart = 3 * (box / 3);
        int colStart = 3 * (box % 3);
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (!checkNumber(sudoku[rowStart + r][colStart + c], seen)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkNumber(int number, boolean[] seen) {
        if (number < 1 || number > 9 || seen[number - 1]) {
            return false;
        }
        seen[number - 1] = true;
        return true;
    }
}
