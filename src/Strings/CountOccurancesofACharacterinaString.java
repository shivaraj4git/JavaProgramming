package Strings;

public class CountOccurancesofACharacterinaString {

	public static void main(String[] args) {
		
		String s = "Java Programming Java Oops";
		
		int total_length = s.length();
		System.out.println(total_length);
		
		int total_length_afterRemoval = s.replace("a", "").length();
		System.out.println(total_length_afterRemoval);
		
		int count = total_length - total_length_afterRemoval;
		
		System.out.println("Number of occurance of a is:" + count);

	}

}