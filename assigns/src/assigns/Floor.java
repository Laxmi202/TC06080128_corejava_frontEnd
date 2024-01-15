/* Example 38*/

package assigns;
public class Floor 
{
	int length;
	int width;
	
	Floor(int length, int width) //Parameterized constructor
	{
		this.length = length;
		this.width = width;
	}
	int totalTiles(Tile t)
	{
		int tileArea = t.edgeLength*2;
		int floorArea = length*width;
		return (int) (floorArea/tileArea);			
	}
	public static void main(String [] args)
	{
		Tile tile = new Tile(2);
		
		Floor floor = new Floor(10,8);
		
		int totalTilesNeeded = floor.totalTiles(tile);
		
		System.out.println("Total number of tiles needed: " + totalTilesNeeded);
	}
}

