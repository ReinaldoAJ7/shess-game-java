package chesspieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Colors;

public class King extends ChessPiece {

    public King(Board board, Colors colors) {
        super(board, colors);
    }

    @Override
    public String toString() {
        return "K";
    }
}
