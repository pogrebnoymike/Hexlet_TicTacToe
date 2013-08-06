import java.util.Scanner;

/**
 * Author: mikhail.pogrebnoy
 * Date: 8/6/13
 * Time: 6:38 AM
 */
public class Main {
    public static void main(String[] args) {
//        GameCanvas newCanvas = new GameCanvas();
        Player player1 = new Player();
        Player player2 = new Player();

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Player 1. Please enter your name:");
        player1.setPlayerName(scanner.nextLine());
        System.out.println("Player 2. Please enter your name:");
        player2.setPlayerName(scanner.nextLine());

        System.out.println("[x] " + player1.getPlayerName() + " >> VS << " + player2.getPlayerName() + " [o]");

        GameCanvas canvas = new GameCanvas(3);
        canvas.showGrid();
    }
}
