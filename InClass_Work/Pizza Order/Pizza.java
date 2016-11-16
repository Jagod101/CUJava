public class Pizza extends Item
{
	enum Topping
	{
		Cheese, Ham, Pineapple, Saussage, Pepperoni, Olives
	}
	
	private int size; // 8 12 16
	
	private Topping[] toppings;
	
	public Pizza(int size, Topping ... toppings) // variadic
	{
		this.size = size;
		this.toppings = toppings;
	}
	
	public Topping[] getToppings()
	{
		return this.toppings;
	}
	
	public long getCostCents()
	{
		long total = 0;
		switch(this.size)
		{
			case 8:
				total += 500;
				break;
			
			case 12:
				total += 1000;
				break;
				
			case 16:
				total += 1500;
				break;
		}
		
		for(Topping t : this.toppings)
		{
			if(t != null)
			{
				total += 100;
			}
		}
		
		return total;
	}
	
	public String getName()
	{
		return "Pizza";
	}
	
	public String getDescription()
	{
		String description = "";
		
		description += " Size: " + this.size + " inch" + "\n";
		
		description += " Toppings:";
		for(Topping t : this.toppings)
		{
			description += " " + t;
		}
		
		description += "\n";
		
		return description;
	}
	
}