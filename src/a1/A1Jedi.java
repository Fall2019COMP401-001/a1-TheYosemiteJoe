package a1;

import java.util.Scanner;

public class A1Jedi {

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

		int[] counnt = new int[itemCount];
		int[] iquanity  = new int[itemCount];
		
		for (int i = 0; i < Ccounter; i++) {
			fName[i] = scan.next();
			lName[i] = scan.next();
			int numBought = scan.nextInt();
			int[] numCount = new int[numBought];
			String[] foodNames  = new String[numBought];

			for (int j = 0; j < numBought; j++) {	
				numCount[j] = scan.nextInt();
				foodNames[j] = scan.next();
				
				for (int k = 0; k < itemCount; k++) {	
					iquanity[k] += ammount(itemNme[k], numCount[j], foodNames[j]);
				}

			}

			for (int c = 0; c < itemNme.length; c++) {
				counnt[c] += didBuy(itemNme[c], foodNames);
			}
			}
			 for (int y = 0; y < itemNme.length; y++) {
				 if (counnt[y] == 0) {
					 System.out.println("No customers bought " + itemNme[y]);
				 }else {
					 System.out.println(counnt[y] + " " + "customers bought " + iquanity[y] + " " + itemNme[y]);
				 }
			 }
				 }
			private static int didBuy(String itemNme, String[] foodNames) {
				for (int i=0; i < foodNames.length; i++) {
					if (itemNme.equals(foodNames[i])) {
						return 1;
					}
				}
				return 0;
			}
			
			private static int ammount(String itemNme, int numCount, String foodNames) {
				int total = 0;
				
				if(itemNme.contentEquals(foodNames)) {
					total = (total + numCount);
				}
				return total;
				
				}
			}