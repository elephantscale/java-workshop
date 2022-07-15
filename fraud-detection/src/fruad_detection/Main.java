package fruad_detection;

public class Main {

	public static void main(String[] args) throws Exception {
		InMemoryBlacklistedIPLookup blacklistLookup = new InMemoryBlacklistedIPLookup();
		
		WebLogAnalyzer webLogAnalyzer = new WebLogAnalyzer(blacklistLookup);
		webLogAnalyzer.analyzeFile("weblogs.csv");

	}

}
