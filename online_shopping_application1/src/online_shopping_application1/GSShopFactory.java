package online_shopping_application1;

public class GSShopFactory implements ShopFactory{

	@Override
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc gsprime = new GSPrimeAcc(++accNo, accNm, charges, isPrime);
	
		System.out.println(" \nPrime  Account");
	
		gsprime.toString();
		gsprime.bookProduct(1000);
		
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc gsnormal = new GSNormalAcc(++accNo, accNm, charges, deliveryCharges);
		
		System.out.println(" \nNormal Account");
		
		gsnormal.toString();
		gsnormal.bookProduct(1000);
		
		return gsnormal;
	}	
}
