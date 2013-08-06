/**
 * Author: mikhail.pogrebnoy
 * Date: 8/6/13
 * Time: 7:48 AM
 */

public class GameCanvas {
    private static final int GRID_SIZE = 3;
    private static char DEFAULT_SYMBOL = ' ';
    private char[][] GridArray;

    public GameCanvas(){
        this(GRID_SIZE);
    }

    public GameCanvas(int gridSize) {
        GridArray = new char[gridSize][gridSize];
    }



//    public void drawGrid() {
//
//
//    }

}
