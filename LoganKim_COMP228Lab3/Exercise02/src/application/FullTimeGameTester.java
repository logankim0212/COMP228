/** Exercise02: FullTimeGameTester.java
 * Author: Logan Kim
 * Purpose: console application that demonstrates how to create objects of both subclasses. Allow the user to choose
 *          game tester type and enter the number of hours for the part-time testers.
 */
package application;

public class FullTimeGameTester extends GameTester {
	// field variables
	public static final double _BASESALARY = 3000.0;

	// constructor
	public FullTimeGameTester(String name) {
		_name = name;
		_status = "Full-time";
	} // end constructor

	// override methods
	@Override
	public void setSalary() {
		_salary = _BASESALARY;
	} // end setSalary
	public void displayTesterInfo() {
		System.out.println(getStatus() + " Game Tester: \nName: " + getName() + " | Salary: $" + getSalary());
	} // end displayTester
} // end class