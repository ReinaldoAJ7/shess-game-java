package chesspieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colors;

public class Pawn extends ChessPiece {
    public Pawn(Board board, Colors colors) {
        super(board, colors);
    }

    @Override
    public String toString() {
        return "P";
    }
}
