import java.util.Scanner;

public class ConnectFour
{
    public static void main (String[] args)
    {
        char[][] board = new char[6][8];

        Scanner input = new Scanner(System.in);
        char player = 'X';
        boolean winner = false;

        int currentColumn;

        for(int row = 0; row < 6; row++)
        {
            for(int col = 0; col < 7; col++)
            {
                board[row][col] = ' ';
            }
        }

        //Game Loop
        while(!winner)
        {
            //Print Game Board
            System.out.println("\n");
            pBoard(board);

            //Declare Player Turn
            if(player == 'X')
                System.out.println("\nPlayer 1's turn!");
            else
                System.out.println("\nPlayer 2's turn!");

            //User Input for Column
            System.out.println("\nWhat Column would you like to play? [0-6]\n");
            currentColumn = input.nextInt();

            //Error Exception - if user enters number greater than amount of Columns
            if(currentColumn > 6)
            {
                System.out.println("\nPlease only choose a number between [0-6]\n");
                continue;
            }

            //Full Column
            if(fullColumn(board, currentColumn))
            {
                System.out.println("\nLooks like this column is full, please pick a new one\n");
                continue;
            }

            //Place Piece for Current Player
            dropPiece(board, currentColumn, player);

            //Check if winRow
            if(winRow(board) == player)
            {
                pBoard(board);
                System.out.println("\nYou Won!");
                break;   
            }

            //Check if winCol
            if(winCol(board) == player)
            {
                pBoard(board);
                System.out.println("\nYou Won!");
                break;
            }

            //Check if winDiag
            if(winDiag(board) == player)
            {
                pBoard(board);
                System.out.println("\nYou Won!");
                break;
            }

            //Check if gameTie
            if(gameTie(board) == true)
            {
                pBoard(board);
                System.out.println("\nWhoops, looks like the game ended in a Tie!");
                break;
            }

            //Player Switch
            if(player == 'O')
            {
                player = 'X';
            }
            else
            {
                player = 'O';
            }
        }
    }
    
    //Check for Game Win in a Row
    public static char winRow(char[][] board)
    {
        for(int row = 0; row < 6; row++)
        {
            int counter = 0;
            for(int col = 0; col < 6; col++)
            {
                if(board[row][col] != ' ' && board[row][col] == board[row][col+1])
                    counter++;
                else
                    counter = 1;

                if (counter >= 4)
                {
                    return board[row][col];
                }
            }
        }
        return ' ';
    }

    //Check for Game Win in a Column
    public static char winCol(char[][] board)
    {
        for(int col = 0; col < 6; col++)
        {
            int counter = 0;
            for(int row = 0; row < 5; row++)
            {
                if(board[row][col] != ' ' && board[row][col] == board[row+1][col])
                    counter++;
                else
                    counter = 1;

                if (counter >= 4)
                {
                    return board[row][col];
                }
            }
        }
        return ' ';
    }

    //Check for Game Win on a Diagonal Line
    public static char winDiag(char[][] board)
    {
        //Ascending Diagonals
        for (int row = 3; row < 6; row++)
        {
            for (int col = 0; col < 6 - 3; col++)
            {
                if (board[row][col] != ' ' && board[row-1][col+1] != ' ' && board[row-2][col+2] != ' ' && board[row-3][col+3] != ' ' && board[row][col] == board[row][col])
                    return board[row][col];
            }
        }
        //Descending Diagonals
        for (int row = 3; row < 6; row++)
        {
            for (int col = 3; col < 6; col++)
            {
                if (board[row][col] != ' ' && board[row-1][col-1] != ' ' && board[row-2][col-2] != ' ' && board[row-3][col-3] != ' ' && board[row][col] == board[row][col])
                    return board[row][col];
            }
        }
        return ' ';
    }

    //Check for Tied Game
    public static boolean gameTie(char[][] board)
    {
        if(board[0][0] != ' ' && board[0][1] != ' ' && board[0][2] != ' ' && board[0][3] != ' ' && board[0][4] != ' ' && board[0][5] != ' ' && board[0][6] != ' ' )
		{
		    return true;
		}
	    return false;
	}

    //Checks for a Full Column
    public static boolean fullColumn(char[][] board, int col)
    {
        if(board[0][col] != ' ')
        {
            return true;
        }
        return false;
    }

    //Drop Player Piece into Column
    public static void dropPiece(char[][] board, int col, char player)
    {
        for(int row = 5; row >= 0; row--)
        {
            if(board[row][col] == ' ')
            {
                board[row][col] = player;
                return;
            }
        }
    }

    //Print Board
    public static void pBoard(char[][] board)
    {
        for(int row = 0; row < 6; row++)
        {
            for(int col = 0; col < 8; col++)
            {
                System.out.print(" | " + board[row][col]);
            }
            System.out.println();
        }
    }
}