/**
 * Created with IntelliJ IDEA.
 * User: alexander.feskov
 * Date: 8/7/13
 * Time: 3:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    GameGrid gameGrid;

    public Game() {
        this.gameGrid = new GameGrid();
    }

    public GameGrid getGameGrid() {
        return gameGrid;
    }

    public void setGameGrid(GameGrid gameGrid) {
        this.gameGrid = gameGrid;
    }
}
