package Strings;

public class ReverseEachwordInAString {

	public static void main(String[] args) {
	   
		//Approach-1
		String str ="welcome to java";
		String reversestring = "";
		
		System.out.println("Given string:" + str);
		
		String[] words = str.split(" ");
		
		for(String w: words)
		{
			String reverseword ="";
			for (int i =w.length()-1; i>=0; i--)
			{
				reverseword=reverseword + w.charAt(i);
			}
			reversestring =reversestring+reverseword+" ";
		}
		System.out.println("Reverse each words in string:  " +reversestring);
		
		//Approach-2
		String str1 ="welcome to java selenium";
		String reversestring1 = "";
		
		System.out.println("Given string:" + str1);
		
		String[] words1 = str1.split(" ");
		
		for(String w: words1)
		{
			String reverseword ="";
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reversestring1 =reversestring1+sb.toString()+" ";
		}
		System.out.println("Reverse each words in string:  " +reversestring1);
		

	}

}
