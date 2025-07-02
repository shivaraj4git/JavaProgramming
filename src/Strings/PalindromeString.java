package Strings;

public class PalindromeString {

	public static void main(String[] args) {
		 
		String str ="gadag";
		
		System.out.println("Given string is:" + str);
		
		String reversestr ="";
		
		for (int i=str.length()-1; i>=0;i--)
		{
			reversestr =reversestr + str.charAt(i);
		}
		
		System.out.println("reverse of the string is:"+ reversestr);
		
		if(reversestr.equals(str))
		{
			System.out.println("the given string is a palindrome:"+ reversestr);
		}
		else
		{
			System.out.println("given string is not a palindrome:"+ reversestr);
		}
	}

}
