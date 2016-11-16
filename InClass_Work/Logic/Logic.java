import java.util.Scanner;

public class Logic
{
	public static void main(String[] args)
	{
		System.out.println("We the people!");
		
		/*if(1 < 5)
		{
			System.out.println("<text>");
		}
		else if(1 < 2)
		{
			System.out.println("<More text!>");
		}
		*/
		while(true)
		{
			int grade = new Scanner(System.in).nextInt();
			
			if(grade > 90)
			{
				System.out.println("A");
			}
			else if(grade > 80)
			{
				System.out.println("B");
			}
			else if(grade > 70)
			{
				System.out.println("C");
			}
			else if(grade > 60)
			{
				System.out.println("D");
			}
			else
			{
				System.out.println("F");
			}
		}
	}
}