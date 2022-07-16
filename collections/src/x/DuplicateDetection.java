package x;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class DuplicateDetection {

	public static void main(String[] args) {
		
		int numbers = 1000000;
		
		int [] a = new int[numbers];
		int [] b = new int[numbers];
		
		Random random = new Random();
		
		for (int i =0; i < numbers; i++) {
			a[i] = random.nextInt(numbers);
			b[i] = random.nextInt(numbers);
		}
		
		//System.out.println ("a : " + Arrays.toString(a));
		//System.out.println ("b : " + Arrays.toString(b));
		
		//findDuplicates1(a,b);
		
		findDuplicates2(a,b);

	}

	private static void findDuplicates2(int[] a, int[] b) {
		
		// go through a, and insert them all into a set
		// go through b, and check with Set
		
		long t1 = System.currentTimeMillis();				
		int dupeCount = 0;	
		Set<Integer> set1 = new HashSet<>();	
		
		for (int i : a) {
			set1.add(i);
		}
		// set1 has most elements from a
		//System.out.println ("set.size() : " + set1.size());
		for (int j : b) {
			if (set1.contains(j))
				dupeCount ++;
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println ("findDuplicates2: Duplicate number count : " + dupeCount);
		System.out.println ("findDuplicates2: Time took : " + (t2-t1));	
	}

	private static void findDuplicates1(int[] a, int[] b) {
		long t1 = System.currentTimeMillis();				
		int dupeCount = 0;		
		for (int i : a) {
			//System.out.println (i);
			for (int j : b) {
				if (i == j) {
					//System.out.println ("Found dupe ! : " + i);
					dupeCount ++;
					break;
				}
			}
		}
		long t2 = System.currentTimeMillis();
		System.out.println ("findDuplicates1: Duplicate number count : " + dupeCount);
		System.out.println ("findDuplicates1: Time took : " + (t2-t1));	
	}

}
