
package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int itemCount = scan.nextInt();
		double[] prices = new double[itemCount];
		String[] itemNme = new String[itemCount];

		for (int i = 0; i < itemCount; i++) {
			itemNme[i] = scan.next();
			prices[i] = scan.nextDouble();
		}

		int Ccounter = 0;
		Ccounter = scan.nextInt();
		String[] fName = new String[Ccounter];
		String[] lName = new String[Ccounter];
		double[] total = new double[Ccounter];

		for (int i = 0; i < Ccounter; i++) {

			fName[i] = scan.next();
			lName[i] = scan.next();
			int numBought = scan.nextInt();
			int[] numCount = new int[numBought];
			String[] foodNames  = new String[numBought];

			for (int j = 0; j < numBought; j++) {	
				numCount[j] = scan.nextInt();
				foodNames[j] = scan.next();

			}

		System.out.println(fName + " " + lName + " (" + String.format("%.2f", (total)) + ")"); 
		System.out.println("Smallest: " + fName[smallest] + " " + fName[smallest] + " (" + String.format("%.2f", (total[smallest])) + ")");
		System.out.println("Average: " + String.format("%.2f", (average))); 

	}

	

}