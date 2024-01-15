package inheritance;

public class Employee {
	private int empid;
	private String empname;
	public Employee() 
	{}
	
	public Employee(int empid,String empname) 
	{
		super();
		this.empid=empid;
		this.empname=empname;
	}
	
	public String toString() {
		return "Employee [empid="+empid+" empname="+empname+"]";
	}
	
	public boolean equals(Object o) {
		Employee e=(Employee)o;
		if((this.empid==e.empid)&&(this.empname.equals(e.empname)))
          return true;
		else 
			return false;
	}

	
	public static void main(String args[]) {
		Employee e1= new Employee(111,"rahul");
		Employee e2= new Employee(111,"rahul");
		if(e1==e2)
		{
			System.out.println("Equls");
		}
		else
			System.out.println("not Equals");
		
		if(e1.equals(e2))
		{
			System.out.println("object Equls");
		}
		else
			System.out.println("object not Equals");
		
		
		
		
		System.out.println("e1="+e1.hashCode());
		System.out.println("e2="+e2.hashCode());
			
	}
}
