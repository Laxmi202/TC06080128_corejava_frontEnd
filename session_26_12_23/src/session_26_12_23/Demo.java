package session_26_12_23;

import java.util.TreeSet;

public class Demo 
{
	public static void main(String [] args)
	{
		TreeSet<Integer> t= new TreeSet<Integer>(new Mycomparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(10);
		System.out.println(t);
	}

}
