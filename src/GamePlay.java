import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: mikhail.pogrebnoy
 * Date: 8/7/13
 * Time: 10:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class GamePlay {
    private String playerChoices = "";

    public String getPlayerChoices() {
        return playerChoices;
    }

    public void setPlayerChoices(String pChoices) {
        playerChoices += pChoices;
    }
}
