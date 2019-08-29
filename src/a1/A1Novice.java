package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		//Take in the total amount of customers
		int totNumCust = scan.nextInt();
		
		//Arrays to hold the value of the last and first
		//names and price of each customers items
		String[] cmrLastName = new String[totNumCust];
		char[] firstLetter = new char[totNumCust];
		double[] totalPrice = new double[totNumCust];

		//for loop to scan for the first letter and last name and
		//store them in arrays
		for (int i =0; i < totNumCust; i++) {

			String fName = scan.next();
			char fLetter = fName.charAt(0);
			firstLetter[i] = fLetter;
			
			String lName = scan.next();
			cmrLastName[i] = lName;
			
			//scaned for the number of items bought
			int numItemBought = scan.nextInt();

			double total = 0.0;
			
			for (int j = 0; j < numItemBought; j++) {

				//Quanity of each item bought
				//Item name is scanned
				//price of each item 
				int intQuan = scan.nextInt();
				String itemName = scan.next();
				double itemPrice = scan.nextDouble();
				
				//total = total / 100;
				total = (total + intQuan * itemPrice) ;
				
				
			}
			
			//total price stored in an array
			totalPrice[i] = total;
			System.out.println(firstLetter[i] + ". " + cmrLastName[i] + ": "
			+ String.format("%.2f", totalPrice[i]));
		
		}

	}

}

//String[] fName = new String [totNumCust];
	//	String[] lName = new String [totNumCust];
	//	int[] numItemBought = new int [totNumCust];
