package Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		/*
		 * @author: [Shivaraj]
		 * This program reverses an array and prints the elements in reverse order.
		 */
		// Example: Input: {1, 2, 3, 4, 5} Output: {5, 4, 3, 2, 1}
		
		
		int a[] = {1, 2, 3, 4, 5};
		
		int n = a.length;
		
		for (int i = n - 1; i >= 0; i--) 
		{
			System.out.print(a[i] + " ");
		}
		
		
	}

}
