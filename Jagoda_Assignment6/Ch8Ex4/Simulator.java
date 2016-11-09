import java.util.Scanner;
import java.util.Random;

public class Simulator
{
    private static final int numANTS = 100;
    private static final int numDOODLEBUGS = 5;
    
    public static void main(String[] args)
    {
        int turns = 0;

        //Sets up a Board
        Board world = new Board(numANTS, numDOODLEBUGS);

        //Continues to sequence through program while there are still Ants and Doodlebugs alive and on the board
        while(numANTS != 0 || numDOODLEBUGS != 0)
        {
            turns++;
            world.printBoard();
            enterToContinue();
        }
    }

    //Function to control speed of the program mannually
    public static void enterToContinue()
    {
        Scanner enterKey = new Scanner(System.in);
        System.out.println("Press Enter to Continue");
        enterKey.nextLine();
    }
}