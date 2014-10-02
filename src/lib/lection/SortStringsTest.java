package lib.lection;

import java.io.*;

import lib.princeton.In;
import lib.princeton.StdOut;

public class SortStringsTest {

	private static final String testFile = "words3.txt"; // פאיכ ח סכמגאלט
	
	public static void main(String[] args) throws FileNotFoundException {
		String[] a = In.readStrings(testFile);
		FirstSort.sort(a);
		for (int i=0;i<a.length;i++)
			StdOut.println(a[i]);
	}

}
