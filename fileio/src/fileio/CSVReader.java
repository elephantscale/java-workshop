package fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVReader {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("users.csv"));
		
		String line;
		
		while ( (line = reader.readLine()) != null) {
			System.out.println (line);
			
			String [] fields = line.trim().split("\\|");
			if (fields.length == 3) {
				String userID = fields[0];
				int age = Integer.parseInt(fields[1]);
				String address = fields[2];
				
				System.out.println (String.format("userid:%s, age=%d, address=%s", userID, age, address));
			}
		}
		
		reader.close();
	}

}
