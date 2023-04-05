package sorting.simpleSorting;

import sorting.AbstractSorting;
import util.*;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {	
		for (int i = 0; i < array.length; i++) {
			
			int lower = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].compareTo(array[lower]) == -1) {
					lower = j;
					
				}
				Util.swap(array, i, lower);				
			}
		}		
	}
}
