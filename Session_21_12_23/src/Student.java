import java.io.Serializable;

public class Student implements Serializable
{
	private int rollNo;
	private String name;
	private transient float fees; // does not stores the fees value bcoz we used 'transient keyword'
	
	//public Student() {}

	public String Student(int i, String string, float f) 
	{
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
		
		public String toString()
		{
			return "Student [rollNo=" + rollNo + ", name=" + name + " , fees=" + fees + "];
			
		}
	}
	
	

}
