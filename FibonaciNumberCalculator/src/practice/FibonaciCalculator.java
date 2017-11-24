package practice;

public class FibonaciCalculator {
	public static int calculateFibonaciByPosition(int position){
		
		//1 1 2 3 5 8 13 21...
		if(position == 1|| position == 2)
			return 1;
		
		int lastFibonaci = 1;
		int beforeLastFibonaci = 1;
		for(int i=2;i<position;i++){
			int tmp = beforeLastFibonaci + lastFibonaci;
			beforeLastFibonaci = lastFibonaci;
			lastFibonaci = tmp;
		}
		return lastFibonaci;
	}

}
