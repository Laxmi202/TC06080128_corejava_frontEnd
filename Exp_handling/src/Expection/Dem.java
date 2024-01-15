package Expection;

public class Dem
{
	public static void main(String[] args)
	{
			try
			{
				int a,b,c=0;
				
				a= Integer.parseInt(args[0]);
				b=Integer.parseInt(args[1]);
				c=a/b;
				System.out.println("Div= "+c);
			}catch (Exception e)
			{
				if (e instanceof ArithmeticException)
				{
					System.out.println("Denominator should not be zero");
				}
				else if(e instanceof ArrayIndexOutOfBoundsException)
				{
					System.out.println("Enter atleast two numbers");
				}
				else if(e instanceof NumberFormatException)
				{
					System.out.println("Enter only numeric values");
				}
				else
				{
					System.out.println("Exception")
				}
		    }
	}
}
