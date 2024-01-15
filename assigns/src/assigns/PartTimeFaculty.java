/* Example 41*/

package assigns;

public class PartTimeFaculty extends Faculty
{

	double hour;
	double rate;

	public PartTimeFaculty(int facultyid, double hour, double rate) 
	{
		super(facultyid, hour*rate);
		this.hour=hour;
		this.rate=rate;
	}
	public void displayDetails() 
	{
        super.displayDetails();
        System.out.println("Hours: "+hour+"\nRate: " +rate);
    }
}
