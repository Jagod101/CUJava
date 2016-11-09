public class Ant extends Organism
{
    private final int breedingThreshold = 3;

    public Ant()
    {
        super();
        this.symbol = 'o';
        this.breedTicks = 3;
    }

    public Ant(int x, int y)
    {
        super();
        this.symbol  = 'o';
        this.breedTicks = 3;
    }

    public void move()
    {
        //moveToEmpty();
    }

    /*public void breed(Organism world, int x, int y)
    {
        if(this.turns == 3)
        {
            for(int b = 0; b < 4; b++)
            {
                switch(b)
                {
                    case Up:
                        if(world.isOccupied(x, y-1))
                        {
                            world.spawnBug(x, y-1, new Ant());
                            return;
                        }
                        break;
                    case Left:
                        if(world.isOccupied())
                        {
                            world.spawnBug();
                            return;
                        }
                    case Right:
                        if(world.isOccupied())
                        {
                            world.spawnBug();
                            return;
                        }
                    case Down:
                        if(world.isOccupied())
                        {
                            world.spawnBug();
                            return;
                        }
                }
            }
        }
    }*/
}