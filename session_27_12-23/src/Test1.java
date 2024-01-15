
public class Test1 
{
	public static void main(String [] args)
	{
		System.out.println(Thread.currentThread().getName()); //main
		System.out.println(Thread.currentThread().getThreadGroup().getName()); //main
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName()); //system
		
		ThreadGroup g1 = new ThreadGroup("First Group");
		System.out.println(g1.getParent().getName()); //main
		
		ThreadGroup g2 = new ThreadGroup(g1, "Second Group");
		System.out.println(g2.getParent().getName()); //First Group	
	}
}
