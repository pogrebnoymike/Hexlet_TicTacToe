/**
 * Author: mikhail.pogrebnoy
 * Date: 8/6/13
 * Time: 7:48 AM
 */

public class GameCanvas {
    private static final int GRID_SIZE = 3;
    //    private static char DEFAULT_SYMBOL = ' ';
    private int[][] GridArray;

    public GameCanvas() {
        this(GRID_SIZE);
    }

    public GameCanvas(int gridSize) {
        char cellIndex = 1;
        GridArray = new int[gridSize][gridSize];
        for (int l = 0; l < gridSize; l++) {
            for (int c = 0; c < gridSize; c++) {
                GridArray[l][c] = cellIndex;
                cellIndex++;
            }
        }
    }

    public void showGrid() {
        for (int sg = 0; sg < GridArray.length; sg++) {
            showLine(sg);
        }
    }

    private void showLine(int lineToShow) {
        for (int lt = 0; lt < GridArray.length; lt++) {
            System.out.print("[ " + GridArray[lineToShow][lt] + " ] ");
        }
        System.out.println();
    }
}
