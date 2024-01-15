package Expection;

public class Demo1 
{
	public static void main(String[] args)
	{
		try
		{
			int a,b,c=0;
			
			a= Integer.parseInt(args[0]);
			b=Integer.parseInt(args[0]);
			c=a/b;
			System.out.println("Div= "+c);
		}catch (Exception e)
		{
			//System.out.println(e);
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
