package OopsConcepts;

public class EmployeeMain {

	public static void main(String[] args) {
		
		// This is the main class to create Employee objects and display their information.
		Employee emp1 = new Employee();
		emp1.empId = 1;
		emp1.empName = "Alice Johnson";
		emp1.empDesignation = "Software Engineer";
		emp1.displayEmployeeInfo();
		
		Employee emp2 = new Employee();
		emp2.empId = 2;
		emp2.empName = "Bob Smith";
		emp2.empDesignation = "Project Manager";
		emp2.displayEmployeeInfo();

	}

}
