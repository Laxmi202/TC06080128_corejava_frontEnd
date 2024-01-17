package online_shopping_application1;

import java.util.Scanner;

public class GoShopping {
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	
	{ //Assigning instance of GSShopFactory to ShopFactory reference.	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		String accNm=sc.next();
	
		int accNo=1520;
		
		boolean isPrime=false;
		
		System.out.println("Enter the type of account you want to create 1.Prime Account 2.Normal Account: ");
		int choice=sc.nextInt();
		
	// Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
		
		
		if (choice == 1) {
		    // Prime Acc
		    GSShopFactory gssP = new GSShopFactory();
		    gssP.getNewPrimeAccount(accNo, accNm, 1000, isPrime);
		} else if (choice == 2) {
		    // Normal Acc
		    GSShopFactory gssN = new GSShopFactory();
		    gssN.getNewNormalAccount(accNo, accNm, 1000, 50);
		} else {
		    // Handle other cases or provide a default behavior
		    System.out.println("Invalid choice. Please choose 1 for Prime Account or 2 for Normal Account.");
		}

	// Instantiate GSNormalAcc and refer it through reference NormalAcc.	
	
	}
	
}