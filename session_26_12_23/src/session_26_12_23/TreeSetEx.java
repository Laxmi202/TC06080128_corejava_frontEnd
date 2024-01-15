package session_26_12_23;

import java.util.TreeSet;

public class TreeSetEx 
{
	public static void main(String [] args)
	{
		TreeSet<String> t = new TreeSet<>(new MyStringComparator());
		t.add("Rahul");
		t.add("Laxmi");
		t.add("rahul");
		t.add("Jay");
		System.out.println(t);
	}

}
