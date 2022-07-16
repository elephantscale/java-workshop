package x;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {

		String text = "  I don't like CATS,  I also like dogs.  Rabits can be fun too,  But cats and dogs are so cute  ";

//		String text = null;
		
		// TODO: check if the string is null or empty.
		// only proceed if valid
		
		String cleanedText = text.strip().toLowerCase().replaceAll ("[^\\w\\ ]", "");
		System.out.println ("cleanedText: " + cleanedText);
		
		String[] words = cleanedText.strip().toLowerCase().split("\\W+");
		// System.out.println ("words : " + Arrays.toString(words));

		Map<String, Integer> wordCount = new HashMap<>();

		for (String w : words) {
			System.out.println(w);
			
			int existingCount = wordCount.getOrDefault(w, 0);
			System.out.println(
					"word : " + w + ", existing count : " + existingCount + ", updating to " + (existingCount + 1));
			wordCount.put(w, existingCount + 1);

//			if (wordCount.containsKey(w)) {
//				int existingCount = wordCount.get(w);
//				System.out.println(
//						"word : " + w + ", existing count : " + existingCount + ", updating to " + (existingCount + 1));
//				wordCount.put(w, existingCount + 1);
//			} else {
//				System.out.println("word : " + w + ", no existing count, updating to 1");
//				wordCount.put(w, 1);
//			}
		}
		System.out.println (wordCount);

	}

}
