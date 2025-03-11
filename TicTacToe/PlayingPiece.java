package TicTacToe;

public class PlayingPiece {
    private final PieceType piece;
    public PlayingPiece(PieceType pType){
        piece = pType;
    }
    public PieceType getPieceType(){
        return piece;
    }
}
