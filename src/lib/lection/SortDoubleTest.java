package lib.lection;

import lib.princeton.StdOut;
import lib.princeton.StdRandom;



public class SortDoubleTest {

	public static final int n = 10; // кількість чисел для сортування
	
	public static void main(String[] args) {
		Double[] a = new Double[n];
		for (int i = 0;i<n;i++)
			a[i]= StdRandom.uniform();
		FirstSort.sort(a);
		for (int i = 0; i<n;i++)
			StdOut.println(a[i]);
	}

}
