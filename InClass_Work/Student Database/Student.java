public class Student
{
	String firstname;
	String lastname;
	int id;
	float gpa;
	boolean graduated;
	
	/* instance */ void print(/* Student this */)
	{
		System.out.println(this.firstname);
		System.out.println(this.lastname);
		System.out.println(this.id);
		System.out.println(this.gpa);
		System.out.println(this.graduated);
		
	}
}