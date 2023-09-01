package chess;

import boardgame.Board;
import boardgame.Position;
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

    public void initialSetup(){
        board.placePiece(new Rook(board, Colors.WHITE), new Position(0, 0));
        board.placePiece(new Rook(board, Colors.WHITE), new Position(0, 7));
        board.placePiece(new Horse(board, Colors.WHITE), new Position(0,1));
        board.placePiece(new Horse(board, Colors.WHITE), new Position(0,6));
        board.placePiece(new Bishop(board, Colors.WHITE),new Position(0,2));
        board.placePiece(new Bishop(board, Colors.WHITE),new Position(0,5));
        board.placePiece(new King(board, Colors.WHITE), new Position(0, 4));
        board.placePiece(new Queen(board, Colors.WHITE), new Position(0, 3));
        board.placePiece(new Pawn(board,Colors.WHITE), new Position(1, 0));
        board.placePiece(new Pawn(board,Colors.BLACK), new Position(1, 1));
        board.placePiece(new Pawn(board,Colors.WHITE), new Position(1, 2));
        board.placePiece(new Pawn(board,Colors.WHITE), new Position(1, 3));
        board.placePiece(new Pawn(board,Colors.WHITE), new Position(1, 4));
        board.placePiece(new Pawn(board,Colors.WHITE), new Position(1, 5));
        board.placePiece(new Pawn(board,Colors.WHITE), new Position(1, 6));
        board.placePiece(new Pawn(board,Colors.WHITE), new Position(1, 7));

        board.placePiece(new Rook(board,  Colors.BLACK), new Position(7, 0));
        board.placePiece(new Rook(board,  Colors.BLACK), new Position(7, 7));
        board.placePiece(new Horse(board, Colors.BLACK), new Position(7,1));
        board.placePiece(new Horse(board, Colors.BLACK), new Position(7,6));
        board.placePiece(new Bishop(board,Colors.BLACK), new Position(7,2));
        board.placePiece(new Bishop(board,Colors.BLACK), new Position(7,5));
        board.placePiece(new King(board,  Colors.BLACK), new Position(7, 4));
        board.placePiece(new Queen(board, Colors.BLACK), new Position(7, 3));
        board.placePiece(new Pawn(board,Colors.BLACK), new Position(6, 0));
        board.placePiece(new Pawn(board,Colors.BLACK), new Position(6, 1));
        board.placePiece(new Pawn(board,Colors.BLACK), new Position(6, 2));
        board.placePiece(new Pawn(board,Colors.BLACK), new Position(6, 3));
        board.placePiece(new Pawn(board,Colors.BLACK), new Position(6, 4));
        board.placePiece(new Pawn(board,Colors.BLACK), new Position(6, 5));
        board.placePiece(new Pawn(board,Colors.BLACK), new Position(6, 6));
        board.placePiece(new Pawn(board,Colors.BLACK), new Position(6, 7));


    }
}
