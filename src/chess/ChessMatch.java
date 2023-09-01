package chess;

import boardgame.Board;
import chesspieces.*;

public class ChessMatch {
    private Board board;
    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('a',1, new Rook  (board, Colors.WHITE));
        placeNewPiece('h',1, new Rook  (board, Colors.WHITE));
        placeNewPiece('b',1, new Horse (board, Colors.WHITE));
        placeNewPiece('g',1, new Horse (board, Colors.WHITE));
        placeNewPiece('c',1, new Bishop(board, Colors.WHITE));
        placeNewPiece('f',1, new Bishop(board, Colors.WHITE));
        placeNewPiece('e',1, new King  (board, Colors.WHITE));
        placeNewPiece('d',1, new Queen (board, Colors.WHITE));
        placeNewPiece('a',2, new Pawn  (board,Colors.WHITE));
        placeNewPiece('b',2, new Pawn  (board,Colors.WHITE));
        placeNewPiece('c',2, new Pawn  (board,Colors.WHITE));
        placeNewPiece('d',2, new Pawn  (board,Colors.WHITE));
        placeNewPiece('e',2, new Pawn  (board,Colors.WHITE));
        placeNewPiece('f',2, new Pawn  (board,Colors.WHITE));
        placeNewPiece('g',2, new Pawn  (board,Colors.WHITE));
        placeNewPiece('h',2, new Pawn  (board,Colors.WHITE));

        placeNewPiece('a',8, new Rook  (board, Colors.BLACK));
        placeNewPiece('h',8, new Rook  (board, Colors.BLACK));
        placeNewPiece('b',8, new Horse (board, Colors.BLACK));
        placeNewPiece('g',8, new Horse (board, Colors.BLACK));
        placeNewPiece('c',8, new Bishop(board, Colors.BLACK));
        placeNewPiece('f',8, new Bishop(board, Colors.BLACK));
        placeNewPiece('e',8, new King  (board, Colors.BLACK));
        placeNewPiece('d',8, new Queen (board, Colors.BLACK));
        placeNewPiece('a',7, new Pawn  (board, Colors.BLACK));
        placeNewPiece('b',7, new Pawn  (board, Colors.BLACK));
        placeNewPiece('c',7, new Pawn  (board, Colors.BLACK));
        placeNewPiece('d',7, new Pawn  (board, Colors.BLACK));
        placeNewPiece('e',7, new Pawn  (board, Colors.BLACK));
        placeNewPiece('f',7, new Pawn  (board, Colors.BLACK));
        placeNewPiece('g',7, new Pawn  (board, Colors.WHITE));
        placeNewPiece('h',7, new Pawn  (board, Colors.WHITE));

    }
}
