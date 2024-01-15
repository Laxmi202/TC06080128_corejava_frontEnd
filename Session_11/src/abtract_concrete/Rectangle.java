package abtract_concrete;

public class Rectangle extends Shape
{
	private int l,b;
	public Rectangle(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	public double Area()
	{
		return(l*b);
	}
}
