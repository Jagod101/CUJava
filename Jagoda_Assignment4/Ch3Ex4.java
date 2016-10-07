import java.util.Scanner;

public class Ch3Ex4
{
	public static void main(String[] args)
	{		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the cost of the item? *Please remove $ sign");
		double itemCost = input.nextDouble();
		System.out.println("How many years do you want to buy the item for?");
		double yearsPassed = input.nextDouble();
		System.out.println("What is the rate of inflation?");
		double inflationRate = input.nextDouble();
		double inflationFraction = inflationRate / 100;
		
		for(int i = 0; i < yearsPassed ; i++)
		{
			itemCost += itemCost * inflationFraction;
		}
		
		double futureCost = itemCost;
		//Had to look up how to print a double with text
		System.out.printf("The expected cost is $ %.2f" , futureCost);
	}
}