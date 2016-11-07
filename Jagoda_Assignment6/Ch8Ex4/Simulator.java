import java.util.Scanner;
import java.util.Random;

public class Simulator
{
    public static void main(String[] args)
    {
        //Sets up a new Board (tempBoard)
        Board tempBoard = new Board();

        //Prints Board using printBoard method in Board.java
        tempBoard.printBoard();

        //Continues to sequence through program while there are still Ants and Doodlebugs alive and on the board
        while(Board.numOfAnts != 0 || Board.numOfDoodlebugs != 0)
        {
            turn(tempBoard);
            tempBoard.printBoard();
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

    //Function that dictates when a Doodlebug eats an Ant
    public static void eatAnt()
    {

    }

    //Function that dictates an Ants movement
    public static void moveAnt()
    {
        
    }

    //Function that dictates a Doodlebugs movement
    public static void moveDoodlebug()
    {
        
    }

    //Prints the locations of each bug currently alive
    public static void printPosition()
    {
        
    }

    public static void moveSequence()
    {
        
    }

    //The Sequence in which each bug moves/the rules or laws set forth about each bug and how they interact
    public static void turn(Board tempBoard)
    {

    }
}