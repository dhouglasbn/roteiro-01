package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.*;

/**
 * The bubble sort algorithm iterates over the array multiple times, pushing big
 * elements to the right by swapping adjacent elements, until the array is
 * sorted.
 */
public class BubbleSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int n = array.length;
		boolean swapped = true;
		
		while (swapped) {
			swapped = false;
			for (int j = 0; j < n - 1; j++) {
				if (array[j].compareTo(array[j+1]) == 1) {
					Util.swap(array, j, j + 1);
					swapped = true;
				}
			}
		}
	}
}
