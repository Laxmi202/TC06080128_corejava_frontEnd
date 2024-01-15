import java.io.Serializable;
import java.util.LinkedList;
import java.util.RandomAccess;

public class Linklist_ex 
{
	private static final String ListIterator = null;

	public static void main(String [] args)
	{
	/*LinkedList l = new LinkedList();
		l.add("Jake");
		l.add(40);
		l.add(null);
		l.add(40);
		
		System.out.println(l);
		
		l.set(0, "Laxmi");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst(40);
		System.out.println(l);
		
		l.add(0, "Max");
		System.out.println(l);
		
    	System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		
		l.remove();
		System.out.println(l); //removes 1st element
		
		l.remove(1); //removes the element on index 1
		System.out.println(l);	*/
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("Laxmi");
		l.add("Max");
		l.add("Kate");
		l.add("Ash");
		l.add("John");
		
		System.out.println(l);
		
		java.util.ListIterator<String> itr = l.listIterator();
		while(itr.hasNext())
		{
			String str = itr.next();
			if(itr.equals("Laxmi"))
			{
				itr.set("Muppasani");
			}
		}
		
		
	}

}
