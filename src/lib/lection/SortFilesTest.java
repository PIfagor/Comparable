package lib.lection;

import java.io.*;
import lib.princeton.StdOut;

public class SortFilesTest {

	private static final String testDir = "C:\\Windows"; // тестова директорія
	
	public static void main(String[] args) {
		File directory = new File(testDir);
		File[] files = directory.listFiles();
		FirstSort.sort(files);
		for (int i=0;i<files.length;i++)
			StdOut.println(files[i].getName());
	}

}
