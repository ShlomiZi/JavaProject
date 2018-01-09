/**
 * Created by ShlomiZ on 08/01/2018.
 */
/**
 * Created by ShlomiZ on 08/01/2018.
 */
public class Main {
    public static void main(String[] args) {
        //Launch the game.
        GameLauncher gameLauncher = new GameLauncher();
        //create game runner.
        GameRunner game = new GameRunner(gameLauncher.getBoard(), gameLauncher.getPlayer1(), gameLauncher.getPlayer2(),
                gameLauncher.getRules(), gameLauncher.getDisplay());
        //run the game.
        game.run();
    }
}
