public class Drink extends Item
{
	enum Size { TwoLiter, TwentyOunce }
	
	private Size size;
	private String name;
	
	public Drink(Size s, String name)
	{
		this.size = s;
		this.name = name;
	}
	
	public long getCostCents()
	{
		switch(this.size)
		{
			case TwoLiter:
				return 199;
			
			case TwentyOunce:
				return 99;
				
			default:
				throw new RuntimeException("Unknown size " + this.size);
		}
	}
	
	public String getName()
	{
		switch(this.size)
		{
			case TwoLiter:
				return "2L " + this.name;
			
			case TwentyOunce:
				return "20oz " + this.name;
				
			default:
				throw new RuntimeException("Unknown size " + this.size);
		}
	}
	
	public String getDescription()
	{
		return "";
	}
}