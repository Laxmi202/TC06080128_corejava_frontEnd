import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arraylist 
{
	public static void main(String[] args)
	{
		/*int no=10;
		Integer i = new Integer(no); //boxing
		
		int a = i.intValue(); //unboxing 
		
		int b = 100;
		Integer m = b; //Autoboxing
		int c = m; //auto-unboxing*/
		 
		List<Integer>l = new ArrayList<Integer>();
		l.add(10);
		l.add(56);
		l.add(10);
		//l.add(null);
		System.out.println(l);
		
		Iterator<Integer> i = l.iterator();
		while(i.hasNext())
		{
			int n = i.next();
			if(n%2==0)
			{
				System.out.println(n);
			}
			else
			{
				i.remove();
			}
		}
		System.out.println(l);
		 
		/*l.add(2,56);
		System.out.println(l);
		
		l.remove(l);
		System.out.println(l);
		
		System.out.println(l.contains(100));
		
		List l1 = Collections.synchronizedList(l);*/
		
		 
		
		
		
	}

}
