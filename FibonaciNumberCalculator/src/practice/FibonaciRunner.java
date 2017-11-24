package practice;

import java.util.Scanner;

public class FibonaciRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Enter the position of the fibonaci number: ");
		Scanner in = new Scanner(System.in);
		int position = in.nextInt();
		
		int fibonaciAtPosition = FibonaciCalculator.calculateFibonaciByPosition(position);
		System.out.println("The fibonaci at "+position+" position is :"+fibonaciAtPosition);

	}

}
