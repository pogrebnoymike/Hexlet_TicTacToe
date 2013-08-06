import java.util.Scanner;

/**
 * Author: mikhail.pogrebnoy
 * Date: 8/6/13
 * Time: 6:38 AM
 */

public class Main {
    public static void main(String[] args) {
        final int GRID_SIZE = 3;
        final int NUMBER_OF_PLAYERS = 2;

        String[] Players = new String[NUMBER_OF_PLAYERS];

        Scanner scanner = new Scanner(System.in);
        for (int pName = 0; pName < Players.length; pName++) {
            System.out.println("Player " + (pName + 1) + ". Please enter your name:");
            Players[pName] = scanner.nextLine();
        }

        System.out.println();

        GameGrid canvas = new GameGrid(GRID_SIZE);
        canvas.showGrid();

        int turn = 0;
        char turnSelect = 'x';

        for (int setLine = 0; setLine < GRID_SIZE; setLine++) {
            for (int setCell = 0; setCell < GRID_SIZE; setCell++) {
                System.out.println(Players[turn] + ", your turn.");

                canvas.showGrid();
                canvas.setGridCell(setLine, setCell, turnSelect);

                turn = (turn == 0) ? 1 : 0;
                turnSelect = (turnSelect == 'x') ? 'o' : 'x';
            }


        }
    }
}