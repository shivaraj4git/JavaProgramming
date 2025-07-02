package Strings;

public class HowToRemoveWhiteSpacesinString {

	public static void main(String[] args) {
		
		String str = "welocome to java automation selenium";
		
		System.out.println("Before removing the spaces: " + str);
		
		str =str.replaceAll("\\s", "");
		
		System.out.println("After removing white spaces: " + str);

	}

}
