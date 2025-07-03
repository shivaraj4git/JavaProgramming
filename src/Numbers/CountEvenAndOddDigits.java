package Numbers;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		
	// This program counts the number of even and odd digits in a given number.\
		// It initializes a number and uses a while loop to extract each digit,
	/*
	 * * Example: Input: 123456 Output: Even numbers in a digit: 3 Odd numbers in a
	 * digit: 3
	 */
		int num = 123456;
		
		int even_count = 0;
		int odd_count = 0;
		
		// Count the even and odd digits in the number
		while(num>0)
		{
			int rem = num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			
			num=num/10;
			
		}
		
		// Output the counts of even and odd digits	
		System.out.println("Even numbers in a digit: " + even_count);
		
		System.out.println("Odd numbers in a digit: " + odd_count);
	}

}
