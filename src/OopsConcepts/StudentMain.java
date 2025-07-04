package OopsConcepts;

public class StudentMain {

	public static void main(String[] args) {
		
		// This is the main class to create a Student object and display its information.
		
		//By using constructor
		Student stu1= new Student(101,"david", 'A');
		
		//By using reference variable
		/*stu1.sid=101;
		stu1.sname="John Doe";
		stu1.sgrade='A';
		stu1.displayStudentInfo();*/
		
		Student stu2= new Student(103,"Yuva",'d');
		stu2.sid=102;
		stu2.sname="Jane Smith";
		stu2.sgrade='B';
		stu2.displayStudentInfo();
		
		//by using method
		stu2.setStudentData(103, "Shiva", 'A');		// You can create more Student objects and display their information similarly.

	}

}
