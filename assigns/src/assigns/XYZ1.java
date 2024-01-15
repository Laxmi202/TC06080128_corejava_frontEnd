/* Example 41*/

package assigns;

public class XYZ1 
{ 
	public static void main(String[] args) 
	{
        FullTimeFaculty fulltime1 = new FullTimeFaculty(1, 50000, 2000);
        FullTimeFaculty fulltime2 = new FullTimeFaculty(2, 60000, 2500);
        PartTimeFaculty parttime1 = new PartTimeFaculty(3, 20, 100);
        PartTimeFaculty parttime2 = new PartTimeFaculty(4, 15, 120);

        fulltime1.displayDetails();
        fulltime2.displayDetails();
        parttime1.displayDetails();
        parttime2.displayDetails();
    }
}
