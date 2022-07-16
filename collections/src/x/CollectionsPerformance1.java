package x;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsPerformance1 {

	public static void main(String[] args) {
		int insertElements = 10000000;
		int queryElements = 100000;

		benchInsert(new ArrayList<Integer>(), insertElements);
		benchQuery(new ArrayList<Integer>(), queryElements);
		
		benchInsert(new Vector<Integer>(), insertElements);
		benchQuery(new Vector<Integer>(), queryElements);
		
		benchInsert(new LinkedList<Integer>(), insertElements);
		benchQuery(new LinkedList<Integer>(), queryElements);
		
		benchInsert(new HashSet<Integer>(), insertElements);
		benchQuery(new HashSet<Integer>(), queryElements);
		
		benchInsert(new TreeSet<Integer>(), insertElements);
		benchQuery(new TreeSet<Integer>(), queryElements);

	}

	static void benchInsert(Collection<Integer> collection, int numElements) {
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
			collection.add(i);
		}
		long t2 = System.currentTimeMillis();
		System.out.println(String.format("%s : insert time for %,d elements is %,d ms", collection.getClass(),
				numElements, (t2 - t1)));
	}

	static void benchQuery(Collection<Integer> collection, int numElements) {
		Random random = new Random();

		// populate the collection
		for (int i = 0; i < numElements; i++) {
			collection.add(random.nextInt(numElements));
		}

		// query
		long t1 = System.currentTimeMillis();
		for (int i = 0; i < numElements; i++) {
			collection.contains(random.nextInt(numElements));
		}
		long t2 = System.currentTimeMillis();
		System.out.println(String.format("%s : query time for %,d elements is %,d ms", collection.getClass(),
				numElements, (t2 - t1)));
	}

}