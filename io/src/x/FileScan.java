package x;

import java.io.File;

public class FileScan {

	public static void main(String[] args) {

		File aDir = new File ("."); // C:   C:/    C:\\
		System.out.println (aDir.getAbsolutePath());
		
		File[] contents = aDir.listFiles();
		
		for (File f : contents) {
			System.out.println (f.getAbsolutePath());
			System.out.println (   "    f.isDirectory?: " + f.isDirectory());
			f.length();
			f.isHidden();
			f.lastModified();
		}
	}

}
