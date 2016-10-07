import java.util.Scanner;
import java.lang.Math;

public class Ch3Ex1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double n = input.nextDouble();
		double guess = n/2;
		
		double percentDiff = Double.MAX_VALUE;
		double prevGuess = guess;

		while (Math.abs(percentDiff) >= 0.01)
		{                        
			double r = n / guess;
			guess = (guess + r) / 2;
			percentDiff = ((guess-prevGuess)/prevGuess);
			prevGuess = guess;
			System.out.println(guess);
		}
	
	}
}