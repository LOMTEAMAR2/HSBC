package constructor;

public class Candidate {

	int id;
	String name;
	String dept;
	String grade;
	
	public Candidate()
	{
		
	}
	
	public Candidate(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public Candidate(int id, String name, String dept, String grade)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.grade=grade;
	}
	
	public static void main(String args[])
	{
		Candidate c1 = new Candidate();
		
		Candidate c2 = new Candidate(01, "Akash");
		
		Candidate c3 = new Candidate(02,"Naresh", "Testing", "A+");
		
		c1.display();
		c2.display();
		c3.display();
		
	}
	
	public void display()
	{
		System.out.println("ID = " + id);
		System.out.println("name = " + name);
		System.out.println("Dept = " + dept);
		System.out.println("Grade = " + grade);
		System.out.println("---------------------------------");
	}

}
