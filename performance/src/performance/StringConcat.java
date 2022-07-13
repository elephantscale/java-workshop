package performance;

public class StringConcat {

	public static void main(String[] args) {
		// string + append
		long t1 = System.currentTimeMillis();
		String s = "";
		for (int i=0 ; i < 100000; i++) {
			s += "a";
		}
		System.out.println ("string.length : " + s.length());
		long t2 = System.currentTimeMillis();
		System.out.println ("string append took (ms): " + (t2-t1));
		
		
		t1 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i=0 ; i < 100000; i++) {
			sb.append("a");
		}
		System.out.println ("stringBuffer.length : " + sb.length());
		t2 = System.currentTimeMillis();
		System.out.println ("stringBuffer.append time took (ms): " + (t2-t1));
	}
	
	
}
