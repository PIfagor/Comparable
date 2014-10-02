package tester;

import java.util.Arrays;

import lib.lection.FirstSort;
import lib.lection.InsertionSort;
import lib.lection.MergeSort;
import lib.lection.SelectionSort;
import lib.lection.ShellSort;

public class Runer {

	public static Squirrel[] inits() {
		Squirrel[] sq = new Squirrel[7];
		sq[0] = new Squirrel(false, Colors.BROWN, 35, "Eric Cartman", 45, true);
		sq[2] = new Squirrel(false, Colors.RED, 27, "Kyle Broflovski", 45, true);
		sq[4] = new Squirrel(false, Colors.BLACK, 25, "Stan Marsh", 45, true);
		sq[5] = new Squirrel(false, Colors.BROWN, 7, "Kenny McCormick", 45,
				true);
		sq[1] = new Squirrel(true, Colors.GREY, 65, "One", 45, true);
		sq[6] = new Squirrel(false, Colors.RED, 65, "Two", 45, true);
		sq[3] = new Squirrel(true, Colors.BROWN, 65, "Three", 45, true);
		return sq;
	}

	/**
	 * @param args
	 * @author Wise
	 * Shell sort NOT STABILITY
	 */
	public static void main(String[] args) {
		Squirrel[] sq = inits();


		for (int i = 0; i < sq.length; i++) {
			System.out.println(sq[i]);
		}
		
		ShellSort.sort(sq); //no stability
		// Arrays.sort(sq);
		//FirstSort.sort(sq); 
		//InsertionSort.sort(sq);
		//SelectionSort.sort(sq);
		//MergeSort.sort(sq); 
		for (int i = 0; i < sq.length; i++) {
			System.out.println(sq[i]);
		}

	}

}
