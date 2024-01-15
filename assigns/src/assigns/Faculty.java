/* Example 41*/

package assigns;

public class Faculty 
{ 
	int facultyid;
	double salary;
	
	public Faculty(int facultyid,double salary)
	{
		this.facultyid=facultyid;
		this.salary=salary;
	}

	public void displayDetails() 
	{
		System.out.println("Faculty ID:" + facultyid + "\nSalary: " + salary);
	}
}
