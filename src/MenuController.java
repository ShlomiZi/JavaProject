/**
 * Created by ShlomiZ on 14/01/2018.
 */
public class MenuController {
    public void handleQuit() {
        System.exit(0);
    }

    public void haneNewGame() {
        //Launch the game.
        GameLauncher gameLauncher = new GameLauncher();
        //create game runner.
        GameRunner game = new GameRunner(gameLauncher.getBoard(), gameLauncher.getPlayer1(), gameLauncher.getPlayer2(),
                gameLauncher.getRules(), gameLauncher.getDisplay());
        //run the game.
        game.run();
    }

}
