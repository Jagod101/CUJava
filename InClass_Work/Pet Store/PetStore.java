public class PetStore
{
	public static void main(String[] args)
	{
		Dog fido = new Dog("fido");
		
		speak(fido);
		speak(fido);
	}
	
	public static void speak(Dog d)
	{
		System.out.println(d.getName() + " says woof!");
		// d.name = "bobby";
	}
}