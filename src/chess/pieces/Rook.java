package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    //represnetando a peca por uma letra
    @Override
    public String toString(){
        return "R";
    }

}
