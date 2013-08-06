/**
 * Author: mikhail.pogrebnoy
 * Date: 8/6/13
 * Time: 7:48 AM
 */

public class GameGrid {
    private static final int GRID_SIZE = 3;
    private static char DEFAULT_SYMBOL = 'x';
    private char[][] GridArray;

    public char getGridCell(int x, int y) {
        return GridArray[x][y];
    }

    public void setGridCell(int x, int y, char cellValue) {
        GridArray[x][y] = cellValue;
    }

    public GameGrid() {
        this(GRID_SIZE);
    }

    public GameGrid(int gridSize) {
        int cellIndex = 1;
        GridArray = new char[gridSize][gridSize];
        for (int l = 0; l < gridSize; l++) {
            for (int c = 0; c < gridSize; c++) {
//                GridArray[l][c] = (char) cellIndex;
                GridArray[l][c] = Character.forDigit(cellIndex, 10);
//                GridArray[l][c] = DEFAULT_SYMBOL;
                cellIndex++;
            }
        }
    }

    public void showGrid() {
        System.out.println("----------------------------------------------");
        System.out.println("When prompted, enter a number as shown below.");
        System.out.println();

        for (int sg = 0; sg < GridArray.length; sg++) {
            showLine(sg);
            if (sg < 2) {
                System.out.println("--- --- ---");
            }
        }

        System.out.println("----------------------------------------------");
    }

    private void showLine(int lineToShow) {
        for (int lt = 0; lt < GridArray.length; lt++) {
            String start = "";
            String end = "";
            switch(lt){
                case 0:
                    start = " ";
                    end = " | ";
                    break;
                case 1:
                    end = " | ";
                    break;
            }
            System.out.print(start + GridArray[lineToShow][lt] + end);
        }
        System.out.println();
    }
}