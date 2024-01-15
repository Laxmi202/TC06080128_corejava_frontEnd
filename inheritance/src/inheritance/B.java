package inheritance;

public class B extends A{
   public void m1() {
	   System.out.println("In m1 of B");
   }
   public void m2() {
	   System.out.println("In m2 of B");
   }
   public static void main(String args[]) {
	  // A b= new B();
	   B b1=new B();
	  // b1.m1();
	  // b.getNo();
	   b1.m1();
	  // ((B) b).m2();
   }
}
