package Product_assign;
import java.util.Scanner;

public class XYZ 
{
	public static void main(String[] args)
	{
		Product[] products = new Product[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter details of the Product" + (i+1) + ":");
			System.out.println("Product ID");
			int pid = scanner.nextInt();
			
		}
	}

}
