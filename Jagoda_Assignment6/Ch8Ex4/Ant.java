public class Ant extends Organism
{
    public Ant()
    {
        super();
        this.symbol = 'o';
        this.breedTicks = 3;
    }

    public Ant(int row, int col)
    {
        super();
        this.symbol  = 'o';
        this.breedTicks = 3;
    }

/*
    public Ant(Ant a)
    {
        super(a);
        this.symbol = a.symbol;
        this.breedTicks = a.breedTicks;
    }
*/
    public void moveBug(int direction)
    {

    }
}