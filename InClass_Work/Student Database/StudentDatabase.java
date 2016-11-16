public class StudentDatabase
{
	public static void main(String[] args)
	{
		// Scanner s = new Scanner();
		
		Student s = new Student();
		s.firstname = "David";
		s.lastname = "Tyler";
		s.id = 1531788;
		s.gpa = 4.59f;
		s.graduated = true;
		
		Student s2 = new Student();
		s2.firstname = "Ryan";
		s2.lastname = "Burns";
		s2.id = 1674637;
		s2.gpa = 2.59f;
		s2.graduated = false;
		
		Student.print();
		
		s.print();
		s2.print();
		
		Student s3 = new Student();
		s3.print();
	}
	

}