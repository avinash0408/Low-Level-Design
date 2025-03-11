package TicTacToe;

public class Client {
    public static void main(String[] args) {
       TicTacToeGame game = new TicTacToeGame();
       String winner = game.startGame();
       System.out.print("Player "+winner+" has won this round");
    }
}
