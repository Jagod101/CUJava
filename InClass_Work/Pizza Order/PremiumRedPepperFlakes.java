public class PremiumRedPepperFlakes extends RedPepperFlakes
{
	@Override
	public long getCostCents()
	{
		return 600;
	}
	
	@Override
	public String getName()
	{
		return "Premium Red Pepper Flakes";
	}
	
	@Override
	public String getDescription()
	{ 
		return super.getDescription() + " All the premium, none of the flakiness";
	}
}