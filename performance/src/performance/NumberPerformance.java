package performance;


// This example is from "Effective Java" - ITEM 6

public class NumberPerformance {
	

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		sum1();
		long t2 = System.currentTimeMillis();
		
		System.out.println ("sum1 elapsed time (ms): " + (t2-t1));
		
		
		t1 = System.currentTimeMillis();
		sum2();
		t2 = System.currentTimeMillis();
		
		System.out.println ("sum2 elapsed time (ms): " + (t2-t1));

	}

	// Hideously slow! Can you spot the object creation?
	private static long sum1() {
		Long sum = 0L;
		for (long i = 0; i <= Integer.MAX_VALUE; i++)
			sum += i;
		return sum;
	}
	
	// fast!  Can you spot the difference?
		private static long sum2() {
			long sum = 0L;  // <-- this line!
			for (long i = 0; i <= Integer.MAX_VALUE; i++)
				sum += i;
			return sum;
		}

}
