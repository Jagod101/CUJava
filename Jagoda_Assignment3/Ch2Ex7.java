import java.util.Scanner;

public class Ch2Ex7
{
	public static void main (String[] args)
	{
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		
		System.out.println("Welcome to the Vending Machine - we only accept dollars, so expect change!");
		
		//Input the price of the item
		System.out.println("Enter the price of your item (between 25 cents to 1 dollar");
		Scanner input = new Scanner (System.in);
		int price = input.nextInt();
		
		//Because you can only insert a single dollar, we can subtract the price from the total amount at the beginning
		int change = 100 - price;
		
		while(change >= 5)
		{
			if(change - 25 >= 0)
			{
				quarters++;
				change -= 25;
			}
			else if(change - 10 >= 0)
			{
				dimes++;
				change -= 10;
			}
			else if(change - 5 >= 0)
			{
				nickels++;
				change -= 5;
			}
		}
		
		//Print results of the while loop
		System.out.println("Here is your change!");
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
			
	}
}