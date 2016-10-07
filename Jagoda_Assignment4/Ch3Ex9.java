import java.util.Scanner;
import java.text.DecimalFormat;

public class Ch3Ex9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("How many exercises are you inputting?");
		int numExercise = input.nextInt();
		int ptsEarned = 0;
		int ptsPossible = 0;		
		int totalEarnedPts = 0, totalPossiblePts = 0;
		
		for(int i = 0; i < numExercise; i++)
		{
			System.out.println("Score received for exercise " + (i + 1) + ":");
			ptsEarned = input.nextInt();
			totalEarnedPts += ptsEarned;
			
			System.out.println("Total points possible for exercise " + (i + 1) + ":");
			ptsPossible = input.nextInt();
			totalPossiblePts += ptsPossible;
			
			input.nextLine();			
		}
		input.close();
		
		DecimalFormat percentageFormat = new DecimalFormat("#.00%");
		
		System.out.println("Your total is " + totalEarnedPts + " out of " + totalPossiblePts + ", or " + percentageFormat.format((double)totalEarnedPts / totalPossiblePts) + ".");
	}
}