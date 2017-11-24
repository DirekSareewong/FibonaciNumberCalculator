package practice;

import java.util.Scanner;

public class FibonacciRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Enter the position of the fibonacci number: ");
		Scanner in = new Scanner(System.in);
		int position = in.nextInt();
		
		int fibonacciAtPosition;
		fibonacciAtPosition = FibonacciCalculator.calculateFibonacciByPositionRecursive(position);
		//fibonaciAtPosition = FibonaciCalculator.calculateFibonacciByPosition(position);
		System.out.println("The fibonacci at "+position+" position is :"+fibonacciAtPosition);

	}

}
