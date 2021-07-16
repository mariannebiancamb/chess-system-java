package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
    private Board board; //associando o tabuleiro ao tabuleiro de xadrez

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetUp();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        } return mat;
    }

    public ChessPiece perfomanceChessMove(ChessPosition sourcePosition, ChessPosition targetPosition){
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();

        validateSourcePosition(source);
        Piece capturedPiece = makeMove(source, target);

        return (ChessPiece) capturedPiece;
    }

    private void validateSourcePosition(Position position){
        if (!board.thereIsAPiece(position)) throw new ChessException("There is no piece on source position!");
    }

    private Piece makeMove(Position source, Position target){
        Piece p = board.removePiece(source);
        Piece capturedePiece = board.removePiece(target);

        board.placePiece(p, target);
        return p;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetUp(){
       placeNewPiece('b', 6, new Rook(board, Color.WHITE));
       placeNewPiece('a', 2, new King(board, Color.BLACK));
    }

}
