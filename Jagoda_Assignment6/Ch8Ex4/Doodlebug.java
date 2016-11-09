public class Doodlebug extends Organism
{
    private final int starveThreshold = 3;
    private final int breedingThreshold = 8;
    int timeSinceEat;

    public Doodlebug()
    {
        super();
    }

    public Doodlebug(int x, int y)
    {
        super();
        this.symbol = 'X';
        this.breedTicks = 8;
        this.timeSinceEat = 0;
    }

    public void moveBug(Organism[][] world)
    {
    
    }

    public void breed(Organism[][] world)
    {

    }

    public void starveThreshold(Organism world, int x, int y)
    {

    }

    public void death(Board world, int x, int y)
    {
        if(timeSinceEat == 3)
        {
            world.bugDeath(this, x, y);
        }
    }
}