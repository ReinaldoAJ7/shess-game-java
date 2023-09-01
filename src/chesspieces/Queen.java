package chesspieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colors;

public class Queen extends ChessPiece {
    public Queen(Board board, Colors colors) {
        super(board, colors);
    }

    @Override
    public String toString() {
        return "Q";
    }
}
