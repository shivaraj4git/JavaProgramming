package Numbers;

public class CountSumOfDigits {

	public static void main(String[] args) {
	
		int num = 123456;
		
		System.out.println("Given number is : " + num);
		
		int sum = 0;
		
		while(num>0)
		{
			int lastnum = num%10;
			
			sum = sum + lastnum;
			
			num = num/10;
		}
		
		System.out.println("Sum of the given number: " + sum );
	
	}

}
