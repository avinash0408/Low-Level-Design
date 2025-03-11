package TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    private Deque<Player> players = new LinkedList<>();
    private Board gameBoard;

    public TicTacToeGame(){
        initGame();
    }

    public void initGame(){
        PlayingPiece pieceX = new PlayingPieceX();
        PlayingPiece pieceO = new PlayingPieceO();
        
        Player player1 = new Player("Andy", pieceX);
        Player player2 = new Player("Billy", pieceO);

        players.add(player1);
        players.add(player2);
        
        gameBoard = new Board(3);
    }
    public String startGame(){
        boolean hasWinner = false;
        Scanner sc = new Scanner(System.in);
        while(!hasWinner){
            Player playerTurn = players.removeFirst();
            PlayingPiece curPieceToPLay = playerTurn.getPlayingPiece();
            if(gameBoard.getFreeCells()==0){
                sc.close();
                return "tie";
            }
            System.out.print("Player: "+ playerTurn.getName()+ " ,Enter row,column: ");
            String s = sc.nextLine();
            String[] values = s.split(",");
            int row = Integer.valueOf(values[0]);
            int col = Integer.valueOf(values[1]);
            if(gameBoard.addPiece(row, col, curPieceToPLay)== false){
                System.out.println("Incorrect position, try again !!");
                players.addFirst(playerTurn);
                continue;
            }
            gameBoard.printBoard();
            players.addLast(playerTurn);
            boolean winner = gameBoard.isThereWinner(row,col,playerTurn.getPlayingPiece().getPieceType());
            if(winner){
                sc.close();
                return playerTurn.getName();
            }
        }
        sc.close();
        return "tie";
    }
}
