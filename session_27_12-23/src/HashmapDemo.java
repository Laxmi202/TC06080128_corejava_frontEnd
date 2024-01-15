import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmapDemo 
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("laxmi",700);
		h.put("Kate",800);
		h.put("niki",200);
		h.put("Mate",500);
		System.out.println(h);
		
		System.out.println(h.put("laxmi", 1000));
		System.out.println(h);
		
		Set s = h.keySet();
		System.out.println(s); //returns the string values
		
		Collection c = h.values();
		System.out.println(c); //returns the int values
		
		Set s1 = h.entrySet();
		System.out.println(s1);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m1 =(Map.Entry) itr.next();
			System.out.println(m1.getKey()+" "+m1.getValue());
			if(m1.getKey().equals("laxmi"))
			{
				m1.setValue(1600);
			}
		}
		System.out.println(h);	
	}
}
