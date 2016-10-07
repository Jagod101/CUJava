import java.util.Random;

public class Ch3Ex2
{
	public static void main(String[] args)
	{
		int win = 0;
		int loss = 0;
		int dice1 = 0;
		int dice2 = 0;
		
		for (int i = 0; i < 10000; i++)
		{
			System.out.println("Roll the dice");
			int score = roll (dice1, dice2);
			System.out.println("Score " + score);
			
			if (score == 11 || score == 7)
			{
				System.out.println("You win! \nScore = " + score);
				win = win + 1;
			}
			else if (score == 2 || score == 3 || score == 12)
			{
				System.out.println("You lost... \nScore = " + score);
				loss = loss + 1;
			}
			else
			{
				int point = score;
				System.out.println("Points = " + point);
				
				while (true)
				{
					score = roll(dice1, dice2);
					System.out.println("New Score = " + score);
					if (score == point)
					{
						System.out.println("You Win!");
						win = win + 1;
						break;
					}
					if (score == 7)
					{
						System.out.println("You lose! Good day sir! -Willy Wonka");
						loss = loss + 1;
						break;
					}
				}
			}
		}
		double percent = ((double) win / (win + loss))*100;
		
		System.out.println("Number of wins: " + win);
		System.out.println("Number of losses: " + loss);
		System.out.printf("The probability of winning a game: %.2f" , percent);
		System.out.print("%");
		if (percent <= 50)
			System.out.println("\nThe house has better odds than you");
		else
			System.out.println("\nYou have better odds than the house");
	}
	
	public static int roll (int d1, int d2)
	{
	  Random rollGenerator = new Random ();
	  int dice1 = rollGenerator.nextInt (6) + 1;
	  int dice2 = rollGenerator.nextInt (6) + 1;

	  int score = dice1 + dice2;
	  return score;
	}
}