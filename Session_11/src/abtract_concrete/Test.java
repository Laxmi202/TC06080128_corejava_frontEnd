package abtract_concrete;

public class Test 
{
	public static void main(String args[])
	{
		Bank b1= new SBI();
		System.out.println("SBI="+b1.getROI());
	}
}
