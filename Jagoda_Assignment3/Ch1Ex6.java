import java.lang.Math;

public class Ch1Ex6
{
	public static void main (String[] args)
	{
		//Gear Size units are Inches
		int gearSize = 100;
		//Cadence units are RPM
		int cadence = 90; 
		
		//Conversion Factors
		double inchesToFeet = 1d/12d;
		double feetToMiles = 1d/5280d;
		double minutesToHours = 60d/1d;
		
		//Calculate Speed in MPH
		double Speed = gearSize*Math.PI*inchesToFeet*feetToMiles*cadence*minutesToHours;
		
		System.out.println(Speed);
	}
}