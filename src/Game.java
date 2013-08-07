/**
 * Created with IntelliJ IDEA.
 * User: alexander.feskov
 * Date: 8/7/13
 * Time: 3:38 AM
 * To change this template use File | Settings | File Templates.
 */
public class Game {
    GameLegend gameLegend;

    public Game() {
        this.gameLegend = new GameLegend();
    }

    public GameLegend getGameLegend() {
        return gameLegend;
    }

    public void setGameLegend(GameLegend gameLegend) {
        this.gameLegend = gameLegend;
    }
}
