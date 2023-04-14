package TicTacToeGame;

import java.util.Arrays;

public class TicTacToe {
    static char[][] board = new char[3][3];

    public static boolean gameIsOver(int input, char playerChar) {
        switch (input) {
            case 1-> {
                if (isOccupied(0, 0)) {
                    System.out.println("occupied");
                } else board[0][0] = playerChar;
            }
            case 2-> {
                if (isOccupied(0, 1)) {
                    System.out.println("occupied");
                } else board[0][1] = playerChar;
            }
            case 3 -> {
                if (isOccupied(0, 2)) {
                    System.out.println("occupied");
                } else board[0][2] = playerChar;
            }
            case 4-> {
                if (isOccupied(1, 0)) {
                    System.out.println("occupied");
                } else board[1][0] = playerChar;
            }
            case 5-> {
                if (isOccupied(1, 1)) {
                    System.out.println("occupied");
                } else board[1][1] = playerChar;
            }
            case 6-> {
                if (isOccupied(1, 2)) {
                    System.out.println("occupied");
                } else board[1][2] = playerChar;
            }
            case 7-> {
                if (isOccupied(2, 0)) {
                    System.out.println("occupied");
                } else board[2][0] = playerChar;
            }
            case 8-> {
                if (isOccupied(2, 1)) {
                    System.out.println("occupied");
                } else board[2][1] = playerChar;
            }
            case 9-> {
                if (isOccupied(2, 2)) {
                    System.out.println("occupied");
                } else board[2][2] = playerChar;
            }
        }
        if (isBoardFull()){
            System.out.println("the game is draw");
            return true;
        }
        else if (playerWon(playerChar)){
            System.out.println("player "+playerChar+" won");
            return true;
        }
        return false;
    }

    public static boolean isOccupied(int row, int column){
        if (board[row][column] == 'x' || board[row][column] == 'X'){
            return true;
        }
        else return board[row][column] == 'o' || board[row][column] == 'O';
    }

    public static void displayBoard(char[][] array) {
        for (char[] chars : array) {
            System.out.println(Arrays.toString(chars) + " ");
        }
    }
    public static boolean isValid(char character){
        return character == 'x' || character == 'o' || character == 'X' || character == 'O';
    }
    public static boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell != 'x' && cell != 'o' && cell != 'X' && cell != 'O') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean playerWon(char playerChar) {
        int row = 0;
        while (row < board.length) {
            if (board[row][0] == playerChar && board[row][1] == playerChar && board[row][2] == playerChar) {
                return true;
            }
            row++;
        }
        int column = 0;
        while (column < board.length){
            if (board[0][column] == playerChar && board[1][column] == playerChar && board[2][column] == playerChar){
                return true;
            }
            column++;
        }
        if (board[0][0] == playerChar && board[1][1] == playerChar && board[2][2] == playerChar){
            return true;
        }
        else return board[0][2] == playerChar && board[1][1] == playerChar && board[2][0] == playerChar;
    }
}