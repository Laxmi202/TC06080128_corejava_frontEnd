package inheritance;

public class D extends c{
      public D() {
    	  System.out.println("child default");
      }
      public D(int a) {
    	  super(10);
    	  System.out.println("child parameterized");
      }
      public static void main(String[] args) {
    	  D d=new D(10);
      }
}
