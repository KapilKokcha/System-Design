public class Board {
    final PlayingPiece[][] playingBoard;

    Board() {
        playingBoard = new PlayingPiece[3][3];
    }

    public boolean addPiece(int row, int column, PlayingPiece playingPiece) {
        if (playingBoard[row][column] != null) {
            return false;
        }
        playingBoard[row][column] = playingPiece;
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (playingBoard[i][j] != null) {
                    System.out.print(playingBoard[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }


    public boolean anyFreeCell() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(playingBoard[i][j]==null) return true;
            }
        }
        return false;
    }
}
