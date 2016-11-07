public class Doodlebug extends Organism
{
    static int starveThreshold = 3;
    int timeSinceEat;

    public Doodlebug()
    {
        super();
        this.symbol = 'X';
        this.breedTicks = 8;
        this.timeSinceEat = 0;
    }

    public Doodlebug(int row, int col)
    {
        super();
        this.symbol = 'X';
        this.breedTicks = 8;
        this.timeSinceEat = 0;
    }
/*
    public Doodlebug(Doodlebug d)
    {
        super(d);
        this.symbol = d.symbol;
        this.breedTicks = d.breedTicks;
        this.timeSinceEat = d.timeSinceEat;
    }
*/
    public void moveBug(int direction)
    {

    }
}