
public class MyThread1 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
	}
	
	public static void main(String [] args)
	{
		MyThread1 t1= new MyThread1();
		MyThread1 t2= new MyThread1(); //born state
		MyThread1 t3= new MyThread1();
		
		t1.setName("One");
		t2.setName("Two");
		t3.setName("Three");
		
		//1-10
		t2.setPriority(MAX_PRIORITY);
		t1.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
