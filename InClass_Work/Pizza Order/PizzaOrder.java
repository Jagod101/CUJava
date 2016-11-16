class PizzaOrder extends Object
{
	private Item[] items;
	
	public PizzaOrder(int num_items)
	{
		items = new Item[num_items];
	}
	
	public void addItem(Item item)
	{
		for(int i = 0; i < items.length; i++)
		{
			if(items[i] == null)
			{
				items[i] = item;
				break;
			}
		}
	}
	
	public String getDescription()
	{
		String description = "";
		
		description += "------------------------------" + "\n";
		
		for(int i = 0; i < items.length; i++)
		{
			if(items[i] != null)
			{
				description += "Item #" + (i+1) + ": " + items[i].getName();
				description += " $" + (items[i].getCostCents() / 100f) + "\n";
				description += items[i].getDescription() + "\n";
				description += "------------------------------"+ "\n";
				
				if (items[i] instanceof Pizza)
				{
					Pizza p = (Pizza) items[i];
					Pizza.Topping[] t = p.getToppings();
				}
			}
		}
		
		description += "------------------------------" + "\n";
		description += "Order Total: $" + (getCostCents()/ 100f) + "\n";
		
		return description;
	}
	
	public long getCostCents()
	{
		long total = 0;
		for(int i = 0; i < items.length; i++)
		{
			if(items[i] != null)
			{
				total += items[i].getCostCents();
			}
		}
		return total;
	}
}