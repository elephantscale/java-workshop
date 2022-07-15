package x;

public class WordTokenizer {
	
	public String [] tokenize (String sentence) {
		// v1
		String [] words = sentence.split(" ");
		
		return words;
	}

}
