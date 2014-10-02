package lib.lection;

import lib.princeton.In;
import lib.princeton.StdOut;



public class TestSort {

	private static final String testFile = "words3.txt"; // פאיכ ח סכמגאלט
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] a = In.readStrings(testFile);
		MergeSort.sort(a);
		for (int i=0;i<a.length;i++)
			StdOut.println(a[i]);
	}

}
