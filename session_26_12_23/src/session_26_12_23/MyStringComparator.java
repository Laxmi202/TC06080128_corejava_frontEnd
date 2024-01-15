package session_26_12_23;

import java.util.Comparator;

public class MyStringComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return -s1.compareTo(s2);
	}
}
