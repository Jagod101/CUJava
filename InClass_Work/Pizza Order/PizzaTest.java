public class PizzaTest extends Object
{
	public static void main(String[] args)
	{
		PizzaOrder o = new PizzaOrder(20);
		
		o.addItem(new Pizza(8, Pizza.Topping.Cheese, Pizza.Topping.Pepperoni));
		
		o.addItem(new Icing());
		
		o.addItem(new Pizza(16, Pizza.Topping.Ham, Pizza.Topping.Cheese));
		o.addItem(new Pizza(16));
		o.addItem(new Pizza(16, Pizza.Topping.Olives, Pizza.Topping.Olives, Pizza.Topping.Olives, Pizza.Topping.Olives, Pizza.Topping.Olives));
		o.addItem(new Pizza(26, Pizza.Topping.Ham, Pizza.Topping.Pineapple, Pizza.Topping.Saussage));
		
		o.addItem(new Drink(Drink.Size.TwoLiter, "Diet Coke"));
		
		o.addItem(new Drink(Drink.Size.TwentyOunce, "Dr. Pepper"));
		
		o.addItem(new TwentyOunceDrink("Dr. Pepper"));
		o.addItem(new TwentyOunceDrink());
		
		o.addItem(new RedPepperFlakes());
		
		o.addItem(new PremiumRedPepperFlakes());
		
		System.out.println("Your Order:");
		System.out.println(o.getDescription());
		
		System.out.println("Your Cost: " + o.getCostCents());
		
	}
}