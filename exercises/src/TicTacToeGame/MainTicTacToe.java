package TicTacToeGame;

import java.util.Scanner;

public class MainTicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please pick a character between x and o");
        char character = scanner.next().charAt(0);
        if (character == 'x' || character == 'X'){
            System.out.println("second player is o");
        }
        else if (character == 'o' || character == 'O'){
            System.out.println("second player is x");
        }
        while (!TicTacToe.isValid(character)) {
            System.out.println("invalid character");
            System.out.println("please pick a character between x and o");
            character = scanner.next().charAt(0);
        }

        TicTacToe.displayBoard(TicTacToe.board);
        System.out.println("player " + character + " enter a number");
        int input = scanner.nextInt();


        while (!TicTacToe.gameIsOver(input, character)) {

            if (character == 'x'|| character == 'X'){
                character = 'o';
            } else if (character == 'o' || character == 'O') {
                character = 'x';
            }

            while (input > 9 || input < 1) {
                System.out.println("wrong input enter a number");
                TicTacToe.displayBoard(TicTacToe.board);
                input = scanner.nextInt();
            }
            TicTacToe.displayBoard(TicTacToe.board);
            System.out.println("player " + character + " enter a number");
            input = scanner.nextInt();
        }
    }

}
