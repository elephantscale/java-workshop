package fruad_detection;

import java.io.BufferedReader;
import java.io.FileReader;

public class WebLogAnalyzer {
	
	IBlacklistedIPLookup blacklistLookup;

	public WebLogAnalyzer(IBlacklistedIPLookup blacklistLookup) {
		super();
		this.blacklistLookup = blacklistLookup;
	}

	public void analyzeFile (String logFileName) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(logFileName));
		String line;
		while ( (line = reader.readLine()) != null) {
			System.out.println (line);
			String [] fields = line.trim().split(",");
			if (fields.length == 2) {
				String fromIPAddress = fields[0].trim();
				String page = fields[1].trim();
				System.out.println (String.format("fromIpAddress:%s, page=%s", fromIPAddress,  page));
				// TODO: check if IP is blacklisted
				System.out.println ();
			}
		}
		reader.close();
	}

}
