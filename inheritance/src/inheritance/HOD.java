package inheritance;

public class HOD extends Teacher{
	String branch;
	
	public HOD() {}
	
	public HOD(int id,String name,String sub,String branch) {
		super(id,name,sub);
		this.branch=branch;
		
	}
	
	public void getData() {
		super.getData();
		System.out.println("Branch= "+branch);
	}

}
