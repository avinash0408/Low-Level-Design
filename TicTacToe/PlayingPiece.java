package TicTacToe;

public class PlayingPiece {
    private PieceType piece;
    PlayingPiece(PieceType pType){
        piece = pType;
    }
    public PieceType getPieceType(){
        return piece;
    }
}
