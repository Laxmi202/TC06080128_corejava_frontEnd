/* Example 40*/

package assigns;

public class XYZ 
{
	public static void main(String[] args) 
	{
		TwoBHK flat1 = new TwoBHK(500, 300, 500000, 450);
        TwoBHK flat2 = new TwoBHK(600, 350, 600000, 500);
        TwoBHK flat3 = new TwoBHK(550, 320, 550000, 480);
        
        System.out.println("Flat 1 Information:");
        flat1.show();
        System.out.println("\nFlat 2 Information:");
        flat2.show();
        System.out.println("\nFlat 3 Information:");
        flat3.show();

        double totalAmount = flat1.price + flat2.price + flat3.price;
        System.out.println("\nTotal Amount of all flats: " + totalAmount + " INR");
    }
}
