import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;


    public void initializeGame(){

        //creating 2 Players
        players = new LinkedList<>();
        PlayingPiece crossPieceX = new PlayingPiece(PieceType.X);
        Player player1 = new Player("Player1", crossPieceX);

        PlayingPiece noughtsPieceO = new PlayingPiece(PieceType.O);
        Player player2 = new Player("Player2", noughtsPieceO);

        players.add(player1);
        players.add(player2);

        //initializeBoard
        gameBoard = new Board();
    }

    public String startGame(){

        boolean noWinner = true;
        while(noWinner){

            //take out the player whose turn is and also put the player in the list back
            Player playerTurn = players.removeFirst();

            //get the free space from the board
            gameBoard.printBoard();
            boolean freeCell = gameBoard.anyFreeCell();
            if(freeCell) {
                noWinner = false;
                continue;
            }

            //read the user input
            System.out.print("Player:" + playerTurn.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);


            //place the piece
            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow,inputColumn, playerTurn.playingPiece);
            if(!pieceAddedSuccessfully) {
                //player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorret possition chosen, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow, inputColumn, playerTurn.playingPiece.pieceType);
            if(winner) {
                return playerTurn.name;
            }
        }

        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<3;i++) {

            if(gameBoard.playingBoard[row][i] == null || gameBoard.playingBoard[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<3;i++) {

            if(gameBoard.playingBoard[i][column] == null || gameBoard.playingBoard[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<3;i++,j++) {
            if (gameBoard.playingBoard[i][j] == null || gameBoard.playingBoard[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=2; i<3;i++,j--) {
            if (gameBoard.playingBoard[i][j] == null || gameBoard.playingBoard[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
