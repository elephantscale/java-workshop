package performance;

public class StringPerformance1 {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		for (long i=0 ; i < 10000000000L; i++)
			getMonth1();
		long t2 = System.currentTimeMillis();
		System.out.println ("getMonth1 took (ms): " + (t2-t1));
		
		t1 = System.currentTimeMillis();
		for (long i=0 ; i < 10000000000L; i++)
			getMonth2();
		 t2 = System.currentTimeMillis();
		System.out.println ("getMonth2 took (ms): " + (t2-t1));
	}
	
	private static String getMonth1() {
		return new String ("July");
	}
	
	private static String getMonth2() {
		return "July";
	}


}
