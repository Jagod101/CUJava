import java.util.Random;

public class Board
{
    private static int HEIGHT = 20;
    private static int WIDTH = 20;
    Random randomNumGen = new Random();
    static int numOfAnts;
    static int numOfDoodlebugs;
    static Organism[][] world = new Organism[WIDTH][HEIGHT];

    public enum Direction
    {
        Up,
        Right,
        Left,
        Down
    }

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
    public boolean isOccupied(int x, int y)
    {
        if(Board.world[x][y] != null)
            return true;
        else
            return false;
    }

    public boolean isValid(int x, int y)
    {
        return !(x < 0 || y < 0 || y > HEIGHT - 1 || x > WIDTH - 1);
    }

    public boolean isAnt(int x, int y)
    {
        return isValid(x, y) && !isOccupied(x, y) && this.world[x][y] instanceof Ant;
    }

    public void placeBug(Organism bug, int numBug)
    {
        int x = randomNumGen.nextInt(WIDTH);
		int y = randomNumGen.nextInt(HEIGHT);

        while (this.isOccupied(x, y))
		{
			x = randomNumGen.nextInt(WIDTH);
			y = randomNumGen.nextInt(HEIGHT);
		}

        //Place Ant
        if(bug instanceof Ant)
		{
			world[x][y] = new Ant(x, y);
		}
		
		//Place  Doodlebug 
		else if(bug instanceof Doodlebug)
		{
			world[x][y]= new Doodlebug(x, y);
		}
    }

    public static Organism getBug(int x, int y)
    {
        return world[x][y];
    }

    public static Organism getBug(int[] position)
    {
        return world[position[0]][position[1]];
    }

    public void eatBug()
    {

    }

    public void bugDeath(Doodlebug bug, int x1, int y1)
    {
        if(this.world[x1][y1] != bug)
        {
            throw new RuntimeException("Illegal Turn");
        }
        this.world[x1][y1] = null;
    }
/*
    public void move(Organism bug, int x, int y) 
    {
        {
		for(int i = 0; i < WIDTH - 1; i++)
            for(int j = 0; j < HEIGHT - 1; j++)
            {
                if (this.world[i][j] != null && this.world[i][j] instanceof Doodlebug)
                {
                    this.world[i][j].move(this, i, j);
                }
			}
		}

        for(int i = 0; i < WIDTH - 1; i++)
        {
            for(int j = 0; j < HEIGHT - 1; j++)
            {
                if (this.world[i][j] != null && this.world[i][j] instanceof Ant)
                {
                    this.world[i][j].move(this, i, j);
                }
			}
		}

        for(int i = 0; i < WIDTH - 1; i++)
        {
            for(int j = 0; j < HEIGHT - 1; j++)
            {
                if (this.world[i][j] != null && this.world[i][j] instanceof Doodlebug)
                {
                    ((Doodlebug)this.world[i][j]).eatBug();
                }
			}
		}
	}*/
    /*public void move(Board world, int x1, int y1, int x2, int y2)
    {

    }
    
    public Direction getNewDirection()
    {
        int i = rand.nextInt(0,4);
        switch(i)
        {
            case 0:
                return direction.Down;
            case 1:
                return direction.Left;
            case 2:
                return direction.Right;
            case 3:
                return direction.Up;
        }
    }*/

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