import java.util.Random;

public abstract class Organism
{
    //Organism variables
    int breedTicks;
    int timeSinceBreed;
    char symbol;
    int yPosition;
    int xPosition;

    //Flags for checking Board Parameters
    boolean topFlag;
    boolean leftFlag;
    boolean rightFlag;
    boolean bottomFlag;

    public Organism()
    {
        this.timeSinceBreed = 0;
        this.topFlag = true;
        this.leftFlag = true;
        this.rightFlag = true;
        this.bottomFlag = true;
        this.setYPosition(-1);
        this.setXPosition(-1);
    }

    public Organism(int x, int y)
    {
        this.setYPosition(x);
        this.setXPosition(y);
        this.timeSinceBreed = 0;
    }

    //Gets symbol for Bug Type being used
    public char getSymbol()
    {
        return this.symbol;
    }

    //Gets previous Position of Row
    public int getXPosition()
    {
        return this.xPosition;
    }

    //Checks to make sure bugs don't go above or below Board limits
    public void setXPosition(int x)
    {
        this.topFlag = false;
        this.bottomFlag = false;

        this.xPosition = x;

        if(x <= 0)
            this.topFlag = true;
        else if(x >= 19)
            this.bottomFlag = true;
    }

    //Gets previous Position of Column
    public int getYPosition()
    {
        return this.yPosition;
    }

    //Checks to make sure bugs don't go to the left or right of Board limits
    public void setYPosition(int y)
    {
        this.leftFlag = false;
        this.rightFlag = false;

        this.yPosition = y;

        if(y <= 0)
            this.leftFlag = true;
        else if(y >= 19)
            this.rightFlag = true;
    }

    public static void spawnBug()
    {

    }
/*
    public void moveToEmpty()
    {
        int dir = world.randomNumGen(4);
        switch (dir)
        {
            case 0:
                if(world.isOccupied(x, y - 1))
                {
                    world.moveBug(this, x, y, x, y - 1);
                }
            case 1:
                if(b.isOccupied(x + 1, y))
                {
                    b.moveBug(this, x, y, x + 1, y);
                }
            case 2:
                if(b.isOccupied(x, y + 1))
                {
                    b.moveBug(this, x, y, x, y + 1);
                }
            case 3:
                if(b.isOccupied(x - 1, y))
                {
                    b.moveBug(this, x, y, x - 1, y);
                }
            
        }
    }

    public void move(Board world, int x, int y)
    {
        this.turns++;

        Direction dir = world.makeRandDirection();
        switch(dir)
        {
            case Up:
                if(world.isOccupied(x, y - 1))
                {
                    world.moveBug(this, x, y, x, y - 1);
                }
            case Down:
                if(world.isOccupied(x, y + 1))
                {
                    world.moveBug(this, x, y, x, y + 1);
                }
            case Left:
                if(world.isOccupied(x - 1, y))
                {
                    world.moveBug(this, x, y, x - 1, y);
                }
            case Right:
                if(world.isOccupied(x + 1, y))
                {
                    world.moveBug(this, x, y, x + 1, y);
                }
        }
    }*/
}