package chesspieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colors;

public class Bishop extends ChessPiece {
    public Bishop(Board board, Colors colors) {
        super(board, colors);
    }

    @Override
    public String toString() {
        return "B";
    }
}
