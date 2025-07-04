package OopsConcepts;

public class Greetings {
	
	//1) No params No return type
	void m1()
	{
		System.out.println("Hello,");
	}
	
	//2) No params with return type
	String m2() {
		return "Hello, How are you?";
	}
	
	//3) Takes params No return type
	void m3(String name) {
		// This method takes a name as a parameter and prints a greeting message.
		System.out.println("Hello, " + name);
	}
	
	//4) Takes params with return type
	String m4(String name, int age) {
		// This method takes a name and age as parameters and returns a greeting message.
		return "Hello, " + name + ". You are " + age + " years old.";
	}
	
}
