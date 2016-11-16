import java.util.Scanner;

public class TicTacToe
{
	public static void main(String[] args) throws Exception
	{
		// <type>[] a = new <type>[6];
		
		byte[][] grid = new byte[3][3];
		
		// game loop:
		//  player n input
		//   do turn
		//  check for winner
		//  swap n
		
		Scanner s = new Scanner(System.in);
		byte player = 1;
		boolean winner = false;
		while(!winner)
		{
			// for(int j = 0; j < 30; j++) System.out.print("\b");
			// Runtime.getRuntime().exec("cls");
			// System.out.print ('\f');
			System.out.print(String.format("\033[2J"));
			printBoard(grid);
			
			System.out.println("Player " + player + " turn!");
			int x = s.nextInt() - 1;
			int y = s.nextInt() - 1;
			
			if(grid[x][y] != 0) // unused
			{
				System.out.println("Taken!");
				continue;
			}
			
			grid[x][y] = player;
			
			for(int i = 0; i < 3; i++)
			{
				// winner
				if(grid[i][0] != 0 && grid[i][0] == grid[i][1] && grid[i][0] == grid[i][2])
				{
					System.out.println("Player " + grid[i][0] + " wins!");
					winner = true;
				}
				
				// winner
				if(grid[0][i] != 0 && grid[0][i] == grid[1][i] && grid[0][i] == grid[2][i])
				{
					System.out.println("Player " + grid[0][i] + " wins!");
					winner = true;
				}
			}
			
			// winner
			if(grid[0][0] != 0 && grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2])
			{
				System.out.println("Player " + grid[0][0] + " wins!");
				winner = true;
			}
			
			// winner
			if(grid[0][2] != 0 && grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0])
			{
				System.out.println("Player " + grid[0][2] + " wins!");
				winner = true;
			}
			
			// tie
			boolean tied = true;
			for(int i = 0; i < 3; i++)
			{
				for(int j = 0; j < 3; j++)
				{
					if(grid[i][j] == 0)
					{
						tied = false;
					}
				}
			}
			
			if(tied)
			{
				System.out.println("Tie!");
				winner = true;
			}
			
			if(player == 1) player = 2;
			else player = 1;
		}
	}
	
	public static void printBoard(byte[][] grid)
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				char c = ' ';
				if(grid[i][j] == 1) c = 'X';
				if(grid[i][j] == 2) c = 'O';
				
				System.out.print(" " + c);
				if(j != 2) System.out.print(" |");
			}
			
			System.out.println();
			if(i != 2) System.out.println("--- --- ---");
		}
	}
}