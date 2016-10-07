import java.util.Scanner;
import java.lang.String;

public class Ch2Ex9
{
	public static void main (String[] args)
	{
		//Input a line of text
		System.out.println("Enter a line of text");
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();
		
		//Set keyword for system to search for in the string
		CharSequence keyword = "love";
		
		System.out.println("I have rephrased that line to read:");
		
		//Search string for either love or hate
		if(phrase.contains(keyword) == true)
			System.out.println(phrase.replaceFirst("love", "hate"));
		else
			System.out.println(phrase.replaceFirst("hate", "love"));
	}
}