
public class Mythread extends Thread
{
	public void run()
	{
		//resourse -- running
		System.out.println(Thread.currentThread().getName());	
	}
	public static void main(String[] args)
	{
		Mythread t1 = new Mythread();
		Mythread t2 = new Mythread();
		
	}
	

}
