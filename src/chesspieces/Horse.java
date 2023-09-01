package chesspieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colors;

public class Horse extends ChessPiece {
    public Horse(Board board, Colors colors) {
        super(board, colors);
    }

    @Override
    public String toString() {
        return "H";
    }
}
