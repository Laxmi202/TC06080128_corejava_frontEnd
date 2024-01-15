package clone;

public class Employee implements Cloneable
{
	private int id;
	private String name;
	
	public Employee(int id, String name)
	{
		//super();
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "[id="+id+", name="+name+"]";
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Employee e1= new Employee(111,"Rahul");
		System.out.println(e1);
		Employee e2=(Employee) e1.clone();
		System.out.println(e2);
	}
}
