package online_shopping_application1;

public interface ShopFactory {
	public abstract PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime);
	public abstract NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges);


}