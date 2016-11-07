import java.util.Random;

public class Board
{
    Random randomNumGen = new Random();
    static int numOfAnts;
    static int numOfDoodlebugs;
    static Organism[][] world = new Organism[20][20];

    //Sets up the Board, with the initial value for Ants and Doodlebugs
    public Board()
    {
        numOfAnts = 100;
        numOfDoodlebugs = 5;
        initializeBoard(numOfAnts, numOfDoodlebugs);
    }

    //With respect to Ants and Doodlebugs
    public Board(int ants, int doodlebugs)
    {
        numOfAnts = ants;
        numOfDoodlebugs = doodlebugs;
        initializeBoard(numOfAnts, numOfDoodlebugs);
    }

    public void initializeBoard(int numOfAnts, int numOfDoodlebugs)
    {
        for(int i = 0; i < numOfAnts; i++)
        {
            placeBug(new Ant(), numOfAnts);
        }

        for(int i = 0; i < numOfDoodlebugs; i++)
        {
            placeBug(new Doodlebug(), numOfDoodlebugs);
        }
    }

    //Checks to see if space on the board is occupied or not
    public boolean isOccupied(int row, int col)
    {
        if(Board.world[row][col] != null)
            return true;
        else
            return false;
    }

    public void placeBug(Organism bug, int numBug)
    {

    }

    public static Organism getBug(int row, int col)
    {
        return world[row][col];
    }

    public static Organism getBug(int[] position)
    {
        return world[position[0]][position[1]];
    }

    public static void moveBug()
    {

    }

    //Print Board function
    public void printBoard()
    {
        for(int i = 0; i < world.length; i++)
        {
            //Print Left Edge
            System.out.printf("|", i);

            for(int j = 0; j < world[i].length; j++)
            {
                if(world[i][j] == null) 
                    System.out.print("-");
                else
                    System.out.print(world[i][j].symbol);
            }
            //Print Right Edge
            System.out.print("|");

            if(i < world.length - 1)
                System.out.println();
        }
        
        System.out.println("\n");
        System.out.println("Number of Ants: " + numOfAnts);
        System.out.println("Number of Doodlebugs: " + numOfDoodlebugs);
        System.out.println("\n");
    }
}