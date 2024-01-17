package online_shopping_application1;

public class GSNormalAcc extends NormalAcc {
	
	protected static final float Charges = 50;
	protected static float deliveryCharge=50;


	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
   	
	public void bookProduct(float charges)
	{	
		System.out.println("\n Your Product Charges are: "+charges);
		System.out.println("\n Your Delivery Charges are: "+deliveryCharge);
		System.out.println("\n Your Total Charges are: "+(charges+deliveryCharge));
	}

	@Override
	public String toString() {
		
		System.out.println("Your account is created with Number:" + (getAccNo()) + " & Your Name is: " + getAccNm());
		return "\n";
	}
}

