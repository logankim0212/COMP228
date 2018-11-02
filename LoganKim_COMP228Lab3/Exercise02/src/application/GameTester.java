/** Exercise02: GameTester.java
 * Author: Logan Kim
 * Purpose: console application that demonstrates how to create objects of both subclasses. Allow the user to choose
 *          game tester type and enter the number of hours for the part-time testers.
 */
package application;

public abstract class GameTester {
	// field variables
	protected String _name;
	protected String _status;
	protected double _salary;

	// getters
	public String getName() {
		return _name;
	} // end getName
	public String getStatus() {
		return _status;
	} // end getStatus
	public double getSalary() {
		return _salary;
	} // end getSalary

	// abstract methods
	public abstract void setSalary();
	public abstract void displayTesterInfo();
} // end class