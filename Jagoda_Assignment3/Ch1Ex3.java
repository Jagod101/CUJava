public class Ch1Ex3
{
	public static void main (String[] args)
	{
		//Input Variables
		String first = "zachary";
		String last = "jagoda";
		
		//Take first letter of first and last name
		char firstName = first.charAt(0);
		char lastName = last.charAt(0);
		
		//Take rest of name and Capitalize first letter
		String restOfFirst = first.substring(1,2).toUpperCase() + first.substring(2);
		String restOfLast = last.substring(1,2).toUpperCase() + last.substring(2);
		
		//Add both sections together to form Pig Latin
		String latinName = restOfFirst + firstName + "ay" + " " + restOfLast + lastName + "ay";
		
		//In Class Example (added after completing question)
		//String newFirst = first.substring(1,2).toUpperCase() + first.substring(2) + first.substring(0,1) + "ay";
		//String newLast = last.substring(1,2).toUpperCase() + last.substring(2) + last.substring(0,1) + "ay";
		
		//String LatinName = newFirst + " " + newLast;
		
		System.out.println(LatinName);
	}
}