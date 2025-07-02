package Strings;

public class ReverseAString {
	
	public static void main(String[] args)
	{
	 // ---- Reverse a given string ----
		
		//Approach-1 using length() and charAt() methods
		
		String s ="welcome";
		String rev ="";
		//int l =s.length();
		
		for(int i = s.length()-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
			
		}
		System.out.println("Reverse of a given string:" + rev);
		
		//Approach-2 without using any string methods (By converting string into char array type)
		
		String s1= "welcome";
		
		char a[] = s1.toCharArray(); // toCharArray()-->converts entire string into char array.
		String rev1 = "";
		
		for (int i = a.length-1; i>=0; i--)
		{
			rev1 =rev1 +a[i];
		}
		System.out.println("Reverse of a given string:" + rev1);
		
		//Approach-3 using StringBuffer and StringBuilder class
		
		StringBuffer s2 =new StringBuffer("welcome");
		System.out.println("Reverse of a given string" + s2.reverse());
		
		StringBuilder s3 =new StringBuilder("welcome");
		System.out.println("Reverse of a given string" + s3.reverse());
		
	}

}
