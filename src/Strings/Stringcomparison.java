package Strings;

public class Stringcomparison {

	public static void main(String[] args) {
		
		//Scenario-1
		/*
		String s1 ="welcome";
		String s2 ="welcome";
		
		System.out.println(s1==s2);//true // == is used to compare the objects
		System.out.println(s1.equals(s2));//true// it is used to compare the values of the object
		*/
		
		//Scenario-2
		/*
		String s1 = new String("welcome");
		String s2 = new String("welcome"); //whenever we use the new keyword it creates the another new object.
		
		System.out.println(s1); 
		System.out.println(s2);
		
		System.out.println(s1==s2);//false -->to compare the object.
		System.out.println(s1.equals(s2));//true -->compares the value of the object.
		*/
		
		//Scenario-3
		/*
		String s1 = "abc";
		String s2 = new String ("abc");
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		*/
		
		//Scenario-4
		String s1 = "abc";
		String s2 = new String ("abc");
		String s3=s2;
		
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s2==s3);//true, because objects are equal.
		System.out.println(s2.equals(s3));//true
		
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		
		
		
		
		

	}

}
