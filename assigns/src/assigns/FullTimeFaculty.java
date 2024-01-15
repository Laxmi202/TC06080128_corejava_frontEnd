/* Example 41*/

package assigns;

public class FullTimeFaculty extends Faculty
{
	double basic;
	double allowance;

	public FullTimeFaculty(int facultyid, double basic, double allowance)
	{
		super(facultyid, basic+allowance);
		this.basic=basic;
		this.allowance=allowance;
	}
	
	public void dispalyDetails()
	{
		super.displayDetails(); 
		System.out.println("Basic: "+basic+"\nAllowance: " +allowance);
	}
}
