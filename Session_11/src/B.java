
public class B extends A
{
	B get()
	{
		return this; //can be done by using new B()
	}
	void msg()
	{ 
		System.out.println("Hello World!!!");	
	}
	public static void main(String args[])
	{
		new B().get().msg(); // can be done by using new B().msg()
	}

}
