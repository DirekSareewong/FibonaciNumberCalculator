package practice;

public class FibonacciCalculator {
	public static int calculateFibonacciByPosition(int position){
		
		//1 1 2 3 5 8 13 21...
		if(position == 1|| position == 2)
			return 1;
		
		int lastFibonacci = 1;
		int beforeLastFibonacci = 1;
		for(int i=2;i<position;i++){
			int tmp = beforeLastFibonacci + lastFibonacci;
			beforeLastFibonacci = lastFibonacci;
			lastFibonacci = tmp;
		}
		return lastFibonacci;
	}
	
	public static int calculateFibonacciByPositionRecursive(int position){

		if(position == 1|| position == 2)
			return 1;
		int fibonacci = 0;
		
		fibonacci = calculateFibonacciByPositionRecursive(position-1) + calculateFibonacciByPositionRecursive(position-2);

		return fibonacci;
	}
}
