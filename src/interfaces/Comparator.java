package interfaces;

import tester.Squirrel;

public interface Comparator<T> {
	public int compare(T o1, T o2);

	int compareTo(Squirrel o);
}
