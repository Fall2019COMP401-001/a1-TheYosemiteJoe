package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		//•An integer count of the number of items in the store.
		int numItems = scan.nextInt();

		String[] aIName = new String[numItems];
		double[] aPrice = new double[numItems];

		for (int i = 0; i < numItems; i++) {


			String itemNameS = scan.next();
			aIName[i] = itemNameS;


			double itemPrice = scan.nextDouble();
			aPrice[i] = itemPrice;
		}

		int totNumCust = scan.nextInt();
		String aFName[] = new String[totNumCust];
		String aLName[] = new String[totNumCust];
		int[] aIBought = new int[totNumCust];


		for (int c = 0; c < totNumCust; c++) {

			String firstName = scan.next();
			aFName[c] = firstName;

			String lastName = scan.next();
			aLName[c] = lastName;

			int itemBought = scan.nextInt();
			aIBought[c] = itemBought;


			int[] aIQuan = new int[itemBought];
			String[] aIIName = new String[itemBought];

			double amount = 0.0;
			for (int b = 0; b < itemBought; b++) {

				int itemQuan = scan.nextInt();
				aIQuan[b] = itemQuan;

				String itemName = scan.next();		
				aIIName[b] = itemName;

				for (int x = 0; x < aIName.length; x++) {

				}

			}  	


		}
		System.out.println( "Biggest: " + aFName[c] + " " + aLName[c] + " " + "Amount");
		System.out.println( "Smallest: " + aFName[c] + " " + aLName[c] + " " + "Amount");
		System.out.println( "Average: " + "(Average)");

	}

	
	
}








