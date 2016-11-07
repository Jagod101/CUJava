import java.util.Random;

public class LoadedDice extends Random
{
    Random rand = new Random();

    public LoadedDice()
    {
        super();
    }

    public int nextInt(int num)
    {
        int fifftyChance = rand.nextInt(2);
        if(fifftyChance == 1)
            return num - 1;
        return rand.nextInt(num);
    }

    public static void main(String[] args)
    {
        LoadedDice myDice = new LoadedDice();
        printDiceRolls(myDice);
    }

    public static void printDiceRolls(Random randGenerator)
    {
        for(int i = 0; i < 100; i++)
            System.out.println(randGenerator.nextInt(6) + 1);
    }
}