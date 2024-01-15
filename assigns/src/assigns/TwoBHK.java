/* Example 40*/

package assigns;

public class TwoBHK extends OneBHK
{
	double room2Area;
	
	//default constructor
	TwoBHK()
	{
		super();
		this.room2Area = 0;
	}
	
	//Parameterized constr
	TwoBHK(double roomArea,double hallArea,double price,double room2Area)
	{
		super(roomArea, hallArea, price);
        this.room2Area = room2Area;
	}
	//Method
	void show() 
	{
        super.show();
        System.out.println("Room2Area: " + room2Area);
    }
}

