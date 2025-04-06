public class TicTacToe {

    public static void main(String[] args) {
        char[][] board = {
            {'x', 'o', ' '},
            {' ', 'x', 'o'},
            {' ', ' ', ' '}
        };

        char result = checkWinner(board);
        if (result == 'x' || result == 'o') {
            System.out.println("Spieler " + result + " hat gewonnen!");
        } else {
            System.out.println("Kein Spieler hat bisher gewonnen.");
        }
    }

    private static char checkWinner(char[][] board) {
       
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return board[0][i];
            }
        }
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return board[0][0];
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return board[0][2];
        }
        return ' ';
    }
}
