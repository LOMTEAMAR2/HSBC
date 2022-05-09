package constructor;

public class Student {

	int id;
	String name;
	String branch;
	int marks;
	
	public Student(int id, String name, String branch, int maks)
	{
		this.id = id;
		this.name =name;
		this.branch = branch;
		marks =maks;
	}
	
	public static void main(String args[])
	{
		Student s1 = new Student(01, "Amar", "CIVIL", 85);
		
		System.out.println("ID = " + s1.id);
		System.out.println("name = " + s1.name);
		System.out.println("Marks = " + s1.marks);
		System.out.println("Branch = " + s1.branch);
		
		System.out.println("------------------------------");
		
		Student s2 = new Student(02, "PANKAJ", "MECH", 90);
		
		System.out.println("ID = " + s2.id);
		System.out.println("name = " + s2.name);
		System.out.println("Marks = " + s2.marks);
		System.out.println("Branch = " + s2.branch);
		
		System.out.println("------------------------------");
		
		Student s3 = new Student(03, "ASHITOSH", "CIVIL", 50);
		
		System.out.println("ID = " + s3.id);
		System.out.println("name = " + s3.name);
		System.out.println("Marks = " + s3.marks);
		System.out.println("Branch = " + s3.branch);
		
		System.out.println("------------------------------");
	}
}
