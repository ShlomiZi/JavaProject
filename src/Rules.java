public interface Rules {
    //Enum for representing players
    java.util.ArrayList<Point> whereCanPut(Board b, Board.Color c);

    Board.Color winner(Board b);

    int getScore(Board.Color player, Board b);

    void endGame();

    boolean getEndGame();

}
