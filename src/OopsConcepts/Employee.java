package OopsConcepts;

public class Employee {
// This is the Employee class that contains attributes and a method to display employee information.
	int empId;
	String empName;
	String empDesignation;

   // This method displays the employee information.
	void displayEmployeeInfo() {
		System.out.println("Employee ID: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Designation: " + empDesignation);
	}
}
