package x;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		// ========== arrays =====
		char []letters = new char [5];
		letters[0] = 'a';
		letters[1] = 'b';
		letters[2] = 'c';
		letters[3] = 'd';
		letters[4] = 'e';
		//letters[5] = 'f';  // <-- error!!
		System.out.println ("letters : " + letters);
		System.out.println ("letters[0] :" + letters[0]);
		for (Character c : letters) {
			System.out.println (c);
		}
		System.out.println ("-----------------------");
				

		// ===== array list ====
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println ("arraylist1 " + list1);
		System.out.println ("arraylist1.size() : " + list1.size());
		for (Integer i : list1) {
			System.out.println (i);
		}
		System.out.println ("-----------------------");
		
		
		// ===== set =====
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(1);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println ("set1 : " + set1);
		System.out.println ("set1.size() : " + set1.size());

		if (set1.add(5)) {
			System.out.println ("added to set");
		}
		else
			System.out.println("NOT added to set");
		System.out.println ("-----------------------");
		
		// ---- map -----
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("APPL", 100);
		map1.put("GOOG", 200);
		map1.put("META", 300);
		map1.put("APPL", 150);
		System.out.println ("map1 : " + map1);
		
		System.out.println ("map1.get('APPL') : " + map1.get("APPL"));
		System.out.println ("map1.get('AMAZON') : " + map1.get("AMAZON"));
		
	}

}
