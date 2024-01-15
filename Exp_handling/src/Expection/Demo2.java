package Expection;
//multiple catch blocks
public class Demo2 
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
		}catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter atleast two numbers");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Enter only numeric values");
		}
		catch (Exception e)
		{
			//System.out.println(e);
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("Exception");
		}
	}
}


