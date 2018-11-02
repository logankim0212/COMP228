/** Exercise02: PartTimeGameTester.java
 * Author: Logan Kim
 * Purpose: console application that demonstrates how to create objects of both subclasses. Allow the user to choose
 *          game tester type and enter the number of hours for the part-time testers.
 */
package application;

public class PartTimeGameTester extends GameTester {
	// field variables
	private static final double _RATE = 20;
	private double _hours = 0;

	// getter
	public double getHours() {
		return _hours;
	} // end getHours

	// constructor
	public PartTimeGameTester(String name, double hours) {
		_name = name;
		_hours = hours;
		_status = "Part-time";
	} // end constructor

	// override methods
	@Override
	public void setSalary() {
		_salary = _RATE * getHours() * 4;
	} // end setSalary
	public void displayTesterInfo() {
		System.out.println(getStatus() + " Game Tester: \nName: " + getName() + " | Salary: $" + getSalary());
	} // end displayTester
} // end class
