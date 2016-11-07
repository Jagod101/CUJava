import java.util.Random;

public abstract class Organism
{
    //Organism variables
    int breedTicks;
    int timeSinceBreed;
    char symbol;
    int rowPosition;
    int colPosition;

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
        this.setColPosition(-1);
        this.setRowPosition(-1);
    }

    public Organism(int row, int col)
    {
        this.setColPosition(col);
        this.setRowPosition(row);
        this.timeSinceBreed = 0;
    }

    //Gets symbol for Bug Type being used
    public char getSymbol()
    {
        return this.symbol;
    }

    //Gets previous Position of Row
    public int getRowPosition()
    {
        return this.rowPosition;
    }

    //Checks to make sure bugs don't go above or below Board limits
    public void setRowPosition(int row)
    {
        this.topFlag = false;
        this.bottomFlag = false;

        this.rowPosition = row;

        if(row <= 0)
            this.topFlag = true;
        else if(row >= 19)
            this.bottomFlag = true;
    }

    //Gets previous Position of Column
    public int getColPosition()
    {
        return this.colPosition;
    }

    //Checks to make sure bugs don't go to the left or right of Board limits
    public void setColPosition(int col)
    {
        this.leftFlag = false;
        this.rightFlag = false;

        this.colPosition = col;

        if(col <= 0)
            this.leftFlag = true;
        else if(col >= 19)
            this.rightFlag = true;
    }
}