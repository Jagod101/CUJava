import java.util.Scanner;

public class Ch2Ex4
{
	public static void main (String[] args)
	{
		//Input users name
		System.out.println("What is your first name?");
        Scanner input = new Scanner(System.in);
        String tempFirst = input.nextLine();
		System.out.println("What is your last name?");
        String tempLast = input.nextLine();
		
		//Set all input variables to lowercase
		String first = tempFirst.toLowerCase();
		String last = tempLast.toLowerCase();
		
		//Convert to Pig Latin
		String newFirst = first.substring(1,2).toUpperCase() + first.substring(2) + first.substring(0,1) + "ay";
		String newLast = last.substring(1,2).toUpperCase() + last.substring(2) + last.substring(0,1) + "ay";
		
		String LatinName = newFirst + " " + newLast;
		
		System.out.println(LatinName);
	}
}