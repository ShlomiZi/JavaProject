public interface Display {

    void announceWinner(Board.Color winner);

    void showBoard(Board b);

    void noMoves(Board.Color c);

    void showMoves(Board.Color player, java.util.ArrayList<Point> list);

    void invalidInput();

    void announceMove(Board.Color player, int row, int col);

    void announceNoMve(Board.Color player);
}
