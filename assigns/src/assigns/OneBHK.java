/* Example 40*/

/*Example 40*/

package assigns;

public class OneBHK
{
	double roomArea;
	double hallArea;
	double price;
	
	//default constructor
	OneBHK()
	{
		this.roomArea = 0;
		this.hallArea = 0;
		this.price = 0;
	}
	
	//Parameterized constructor
	OneBHK(double roomArea ,double hallArea, double price)
	{
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;	
	}
	
	//Method to display info
	void show()
	{
		System.out.println("\nRoom Area: "+roomArea+"\nHallArea: "+hallArea+"\nprice: "+price);
	}	
}
