import java.util.Random;

public class Ch8Ex9
{
    public static void printDiceRolls(Random randGenerator)
    {
        for ( int i = 0; i < 100; i++)
        {
            System.out.println(randGenerator.nextInt(6) + 1);
        }
    }
    public static void main(String[] args)
    {
        Random randGenerator = new Random();
        printDiceRolls(randGenerator);
    }
}
