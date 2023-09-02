package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
//https://github.com/acenelio/chess-system-java
public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }
}
