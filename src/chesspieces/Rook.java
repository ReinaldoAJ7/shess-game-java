package chesspieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colors;

public class Rook extends ChessPiece {
    public Rook(Board board, Colors colors) {
        super(board, colors);
    }

    @Override
    public String toString() {
        return "R";
    }
}
