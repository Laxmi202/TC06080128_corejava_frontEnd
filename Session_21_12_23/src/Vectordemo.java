import java.util.*;
public class Vectordemo 
{
	public static void main(String [] args)
	{
		Vector<Integer> v = new Vector<Integer>();
		System.out.println("Capacity="+v.capacity());
		
		for(int i=1; i<10 ; i++)
		{
			v.addElement(i);
		}
		System.out.println(v);
		
		System.out.println("Size="+v.size());
		
		Enumeration<Integer> e = v.elements(); //elements is the object used 
		while(e.hasMoreElements())
		{
			int i = e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				//e.remove();
				//v.remove();
			}
		}
		System.out.println(v);
	}

}
