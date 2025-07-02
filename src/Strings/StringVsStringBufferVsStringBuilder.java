package Strings;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		//String - immutable
		String s = "welcome";
		s.concat("to java");
		System.out.println(s); //welcome //immutable --> cannot change original value of s
		
		//StringBuffer - mutable
		StringBuffer s1 = new StringBuffer("welcome");
		s1.append("to java");
		System.out.println(s1); //welcometo java // mutable --> we can change original value of s1
		
		
		//StringBuilder - mutable
		StringBuilder s2 = new StringBuilder("welcome");
		s2.append("to java");
		System.out.println(s2); //welcometo java // mutable --> we can change original value of s2
		
		

	}

}
