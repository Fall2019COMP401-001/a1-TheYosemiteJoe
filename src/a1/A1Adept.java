package a1;

import java.util.Scanner;

public class A1Adept {

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

			total[i] = caculateTotal(itemNme, prices, numCount, foodNames);

		}

		int smallest = smallSpender(total);
		int biggest = bigSpender(total);
		double average = caculateAverage(total);

		System.out.println("Biggest: " + fName[biggest] + " " + fName[biggest] + " (" + String.format("%.2f", (total[biggest])) + ")"); 
		System.out.println("Smallest: " + fName[smallest] + " " + fName[smallest] + " " + "(" + String.format("%.2f", (total[smallest])) + ")");
		System.out.println("Average: " + String.format("%.2f", (average))); 

	}

	private static double caculateAverage(double[] total) {
		double average = 0;
		double sum = 0;
		
		for(int i=0; i < total.length; i++) {
			double num = total[i];
			sum += num;
			
			if (i == total.length - 1) {
				average = sum / (total.length);
			}
		}
		return average;
	}

	private static int bigSpender(double[] total) {
		double up = total[0];
		int num = 0;
		
		for (int i = 0; i < total.length; i++) {
			
			if (total[i] > up) {
				num = i;
				up = total[i];
			}
		}

		return num;
	} 

	private static int smallSpender(double[] total) {
		double low = total[0];
		int num = 0;
		
		for (int i = 0; i < total.length; i++) {
			
			if (total[i] < low) {
				num = i;
				low = total[i];
			}
		}

		return num;
	}

	private static double caculateTotal(String[] items, double[] prices, int[] numCount, String[] foodNames) { 
		double total = 0;

		for(int i = 0; i < numCount.length; i++) {
			for(int g = 0; g < items.length; g++) {
				if(foodNames[i].contentEquals(items[g])) {
					double num = prices[g] * numCount[i];
					total += num;
				}
			}

		}
		
		return total;
	}
}



































