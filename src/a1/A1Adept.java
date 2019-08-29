package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.

		//•An integer count of the number of items in the store.
		int numItems = scan.nextInt();

		for (int i = 0; i < numItems; i++) {

			String[] aIName = new String[numItems];
			
			double[] aPrice = new double[numItems];



			int totNumCust = scan.nextInt();

			for (int c = 0; c < totNumCust; c++) {
				String aFName[] = new String[totNumCust];
				String aLName[] = new String[totNumCust];
				int[] aIBought = new int[totNumCust];

				for (int b = 0; b < totNumCust; b++) {
					int itemQuan = scan.nextInt();
					String itemName = scan.next();		

					System.out.println( "Biggest: " + aFName + " " + aLName + " " + "Amount");
					System.out.println( "Smallest: " + aFName + " " + aLName + " " + "Amount");
					System.out.println( "Average: " + "(Average)");
				}

			}

		}

	}
	
}



