package application;

import chess.ChessMatch;

public class Program {
    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        //printa o tabuleiro de xadrez na tela
        UI.printBoard(chessMatch.getPieces());
    }
}
