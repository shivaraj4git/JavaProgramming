package Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args)
	{
		// --- String Built-In Methods ---
		
		//Defining Strings
		/*
		 String s ="welcome";
		 String s1 =new String("welcome");
		 System.err.println(s);
		 */
		
		 //length() - returns length of a string(number of characters)
		/*
		 String s2 ="welcome";
		 int l = s2.length();
		 System.out.println(l);
		 System.out.println(s2.length());
		 System.out.println("welcome".length());
		 */
		
		//concat() - Joining strings
		/*
		String s1 ="welcome";
		String s2 = "to Java";
		String s3 = "automation";
		
		System.out.println(s1 + s2); //welcometo Java
		System.out.println(s1.concat(s2)); //welcometo Java
		
		System.out.println(s1+s2+s3);  //welcometo Javaautomation
		System.out.println(s1.concat(s2).concat(s3)); //welcometo Javaautomation
		
		System.out.println(s1.concat(s2 + s3)); //welcometo Javaautomation
		System.out.println("welcome" + "to java"); //welcometo Java
		System.out.println("welcome".concat(s2+s3)); //welcometo Javaautomation
		*/
		
		//trim() --> remove spaces right and left side
		/*
		s1="   welcome   ";
		System.out.println("Before trimming" +s1.length());
		System.out.println(s1); //   welcome    print string along with spaces
		System.out.println(s1.trim());//welcome
		System.out.println("After trimming" + s1.trim().length());
		*/
		
		//charAt() - returns a character from a string based on index
		/*
		s1 ="welcome";
		System.out.println(s1.charAt(3)); //c
		System.out.println(s1.charAt(0)); //w
		
		//contains() --> returns true/false
		System.out.println(s1.contains("wel")); //true
		System.out.println(s1.contains("come")); //true
		System.out.println(s1.contains("Wel")); //false
		System.out.println(s1.contains("COME")); //false
		*/
		
		//equals() , equalsIgnoreCase() - compare strings
		String s1 ="welcome";
		String s2 = "welcome";
		
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals("Welcome")); //false -- case sensitive
		System.out.println(s1.equalsIgnoreCase("WELCOME")); //true
		
		//replace() --> replace single/multiple(or sequance) of characters in string
		s1 = "welcome to selenium java selenium python selenium c#";
		System.out.println(s1.replace('e', 'x')); //wxlcomx to sxlxnium java sxlxnium python sxlxnium c#
		System.out.println(s1.replace("selenium", "playwright")); //welcome to playwright java playwright python playwright c#
		
		//substring() - extract substring from the main string
		//start index --> 0 or any index
		//ending index -->+1
		s1 ="Selenium";
		System.out.println(s1.substring(1,5)); //elen
		System.out.println(s1.substring(0,3)); //sel
		
		//toUpperCase() toLowerCase()
		s1="welcome";
		System.out.println(s1.toUpperCase()); //WELCOME
		System.out.println(s1.toCharArray()); //welcome
		
		//split() - split the string into multiple parts based on delimeter
		s1="abc@gmail.com";
		
		System.out.println(s1.substring(0,3)); //abc
		System.out.println(s1.split("@")); //[Ljava.lang.String;@5ca881b5 (returns array of strings)
		
		String a[] = s1.split("@");
		System.out.println(Arrays.toString(a));//[abc, gmail.com]
		System.out.println(a[0]); //abc
		System.out.println(a[1]);//gmail.com
		
		//Ex-1
		String amount ="$15,20,55";  //exp result: 152055
		System.out.println(amount.replace("$","").replace(",", ""));//152055
		
		//Ex-2
		amount ="abc,123@xyz";
		String arr1[] = amount.split(",");
		System.out.println(Arrays.toString(arr1)); //[abc, 123@xyz]
		
		String arr2[] = arr1[1].split("@");
		System.out.println(Arrays.toString(arr2)); //[123, xyz]
		System.out.println(arr1[0] + arr2[0] + arr2[1]);
		
		//Ex-3
		amount = "abc 123";
		String ar[] =amount.split(" ");
		System.out.println(Arrays.toString(ar)); //[abc, 123]
		// Note: * % ^ & ( )  --> you cannot use as a delimeters
		
		//Ex-4 Note: we can combine two or more methods
		String name = "John Kennedy";
		System.out.println(name.contains("john")); //false
		System.out.println(name.replace('J','j').contains("john")); //true
		System.out.println(name.toLowerCase().contains("john")); //true
		
		
		
		
		
		
	}
}
