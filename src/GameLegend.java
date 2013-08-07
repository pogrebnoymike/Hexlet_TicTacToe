/**
 * Author: mikhail.pogrebnoy
 * Date: 8/6/13
 * Time: 7:48 AM
 */

public class GameLegend {
    private static final int GRID_SIZE = 3;
    private String[][] GridArray;

    public String getGridCell(int x, int y) {
        return GridArray[x][y];
    }

    public void setGridCell(int x, int y, String cellValue) {
        GridArray[x][y] = cellValue;
    }

    public GameLegend() {
        this(GRID_SIZE);
    }

    public GameLegend(int gridSize) {
        int cellIndex = 1;
        GridArray = new String[gridSize][gridSize];
        for (int l = 0; l < gridSize; l++) {
            for (int c = 0; c < gridSize; c++) {
//                GridArray[l][c] = (char) cellIndex;
                GridArray[l][c] = Integer.toString(cellIndex);
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
            if (sg < GridArray.length - 1) {
                for (String[] ignored : GridArray) {
                    System.out.print("---- ");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------");
    }

    private void showLine(int lineToShow) {
        for (int lt = 0; lt < GridArray.length; lt++) {
            String end = "|";
            if (lt == GridArray.length - 1) {
                end = "";
            }

            System.out.format(" %-3s%s", GridArray[lineToShow][lt], end);
        }
        System.out.println();
    }
}