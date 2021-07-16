package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
    // pecas do jogo de xadrez
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
        this.moveCount = 0;
    }

    public Color getColor() {
        return color;
    }



}
