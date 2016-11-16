import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main
{
	static List<Grade> grades = new LinkedList<>();

	public static void main(String[] args) throws IOException
	{
		try
		{
			FileReader fr = new FileReader("grades.csv");

			Scanner fs = new Scanner(fr);
			while (true)
			{
				if (!fs.hasNextLine()) break;
				String s = fs.nextLine();

				int commaPos = s.indexOf(",");

				String scoreStr = s.substring(0, commaPos);
				String endStr = s.substring(commaPos + 1);

				int score = Integer.parseInt(scoreStr);
				int total = Integer.parseInt(endStr);

				Grade g = new Grade(score, total);
				grades.add(g);
			}
		}
		catch (FileNotFoundException e)
		{
			// Ignore
		}

		printStats();

		FileWriter fw = new FileWriter("grades.csv", true);

		Scanner s = new Scanner(System.in);
		while (true)
		{
			System.out.print("Add a grade.");

			System.out.print("Earned Points: ");
			int score = s.nextInt();

			if (score == -1) break;

			System.out.print("Total Points: ");
			int total = s.nextInt();

			System.out.println("");

			Grade g = new Grade(score, total);
			grades.add(g);
			fw.write(score + "," + total + "\n");

			printStats();
		}

		fw.close();
	}

	private static void printStats()
	{
		System.out.println("Stats:");

		System.out.println(" Count: " + grades.size());

		int total = 0;
		int score = 0;

		for (Grade g : grades)
		{
			total += g.total;
			score += g.score;
		}

		System.out.println(" Score: " + score);
		System.out.println(" Total: " + total);

		if (total == 0)
		{
			System.out.println(" Percent: 0%");
		}
		else
		{
			System.out.println(" Percent: " + (score * 100F / total) + "%");
		}
	}
}