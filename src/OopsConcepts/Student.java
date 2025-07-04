package OopsConcepts;

public class Student {

	int sid;
	String sname;
	char sgrade;
	
	void displayStudentInfo() {
		System.out.println("Student ID: " + sid);
		System.out.println("Student Name: " + sname);
		System.out.println("Student Grade: " + sgrade);
	}
	
	
	void setStudentData(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		sgrade=gr;
	}
	
	Student(int id,String name, char gr)
	{
		sid=id;
		sname=name;
		sgrade=gr;
	}
}
