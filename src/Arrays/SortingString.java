package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		
		/*
		 *   This program sorts an array of strings in alphabetical order.
		 */
		
		String s[] = {"Banana", "Apple", "Mango", "Cherry", "Date"};
		// Sorting the array of strings in alphabetical order	
	
        System.out.println("Before sorting...." + Arrays.toString(s));
        
        Arrays.sort(s);
        
        System.out.println("After sorting...." + Arrays.toString(s));
	}

}
