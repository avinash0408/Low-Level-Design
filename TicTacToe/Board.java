package TicTacToe;

public class Board {
    private int size;
    private PlayingPiece board[][];
    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row,int col,PlayingPiece piece){
        if(board[row][col]!=null) return false;
        board[row][col] = piece;
        return true;
    }

    public int getFreeCells(){
        int count=0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null) count++;
            }
        }
        return count;
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(board[i][j]!=null?board[i][j].getPieceType().toString():' ');
                if (j < size - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public boolean isThereWinner(int row,int col,PieceType curPieceType){
        boolean rowMatch = true;
        boolean colMatch = true;
        boolean diagMatch = true;
        boolean antiDiagMatch = true;

        for(int i=0;i<size;i++){
            if(board[row][i]==null || board[row][i].getPieceType()!=curPieceType){
                rowMatch = false;
            }
            if(board[i][col]==null || board[i][col].getPieceType()!=curPieceType){
                colMatch = false;
            }
        }
        for(int i=0,j=0;i<size;i++,j++){
            if(board[i][j]==null || board[i][j].getPieceType()!=curPieceType){
                diagMatch = false;
            }
        }
        for(int i=0,j=size-1;i<size;i++,j--){
            if(board[i][j]==null || board[i][j].getPieceType()!=curPieceType){
                antiDiagMatch = false;
            }
        }

        return rowMatch || colMatch || diagMatch || antiDiagMatch;
    }
}
