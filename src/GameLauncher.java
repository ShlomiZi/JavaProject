/**
 * Created by ShlomiZ on 08/01/2018.
 */
public class GameLauncher {

    private Rules rules;
    private Display display;
    private Board board;
    private LocalHumanPlayer player1;
    private LocalHumanPlayer player2;


    public GameLauncher() {

        int size = 8;
        this.board = new Board(size);
        this.rules = new RegularRules();
        this.display = new ConsoleDisplay();
        //Mode playerMode = display->runMenu();

        this.player1 = new LocalHumanPlayer(Board.Color.BLACK, board, rules, display);
        this.player2 = new LocalHumanPlayer(Board.Color.WHITE, board, rules, display);

    }

    public Rules getRules() {
        return this.rules;
    }

    public Display getDisplay() {
        return this.display;
    }

    public Board getBoard() {
        return this.board;
    }

    public LocalHumanPlayer getPlayer1() {
        return this.player1;
    }

    public LocalHumanPlayer getPlayer2() {
        return this.player2;
    }
}
