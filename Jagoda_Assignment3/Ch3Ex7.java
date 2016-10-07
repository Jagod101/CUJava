import java.util.Scanner;
import java.lang.Math;

public class Ch3Ex7
{
	public static void main(String[] args)
	{
		System.out.println("Please input a value for x");
		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();
		double factorial = 1;
		int counter = 1;
		double result = 1;
		System.out.println("Enter number (n) of iterations you want");
		Scanner variable = new Scanner(System.in);
		int n = variable.nextInt();
		
		/*
		for(counter = 1; counter <= n; counter++)
		{
			factorial = factorial*counter;
			result = factorial;
		}
		*/
		
		while(n>counter)
		{
			factorial = factorial*counter;
			result = result + (Math.pow(x, counter))/factorial;
			counter++;
		}
		System.out.println(result);
	}
}