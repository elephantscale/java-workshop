package x.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import x.WordTokenizer;

class WordTokenizerTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void singleSpaceTwoWordsLowerCase() {
		WordTokenizer tokenizer = new WordTokenizer();
		String [] words = tokenizer.tokenize("cat dog");
		assertEquals(2, words.length);
	}

}
