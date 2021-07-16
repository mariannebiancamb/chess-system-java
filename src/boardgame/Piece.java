package boardgame;

public class Piece {
    protected Position position; //Nao eh visivel no tabuleiro final
    private Board board;

    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    protected Board getBoard() {
        return board;
    }

    public Boolean[][] possibleMoves(){
        return null;
    }

    public Boolean possibleMove(Position position){
        return null;
    }

    public Boolean isThereAnyPossibleMove(){
        return null;
    }

}
