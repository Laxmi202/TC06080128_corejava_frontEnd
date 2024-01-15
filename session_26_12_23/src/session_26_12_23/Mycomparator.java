package session_26_12_23;

import java.util.Comparator;

public class Mycomparator implements Comparator<Integer>
{

	/*@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;*/
	public int compare(Integer i1,Integer i2)
	{
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
			return 0;
	}

}
