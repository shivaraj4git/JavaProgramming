package Strings;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		//Mutable -- we can change
		int a[] = { 20,30,10,50,40};
		System.out.println(Arrays.toString(a));//[20, 30, 10, 50, 40]
		Arrays.sort(a); //mutable -- we can change
		System.out.println(Arrays.toString(a));//[10, 20, 30, 40, 50]
		
		//Immutable --  we cannot change
		String s =new String ("welcome");
		
		System.out.println(s); //welcome
		
		s.concat("to java");
		
		System.out.println(s); //welcome
		
		String concatstring =s.concat("to java");
		
		System.out.println(concatstring);
		
		
		
		
		
		

	}

}
