/** Exercise02: Driver.java
 * Author: Logan Kim
 * Purpose: console application that demonstrates how to create objects of both subclasses. Allow the user to choose
 *          game tester type and enter the number of hours for the part-time testers.
 */
package application;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		// local variables
		Scanner input = new Scanner(System.in);
		String status;
		String name;
		double hours = 0;
		int counter = 0;

		// Loop for status
		while (counter < 1) {
			System.out.print("Enter full time or part time [ F or P ]: ");
			status = input.next();
			// if full-time
			if (status.equalsIgnoreCase("F")) {
				// prompt user for the name of tester
				System.out.print("Enter tester name: ");
				name = input.next();

				// call FullTimeGameTester class
				FullTimeGameTester fullTimeGameTester = new FullTimeGameTester(name);

				// set salary
				fullTimeGameTester.setSalary();

				// display tester information
				fullTimeGameTester.displayTesterInfo();
				counter++;
			// if part-time
			} else if (status.equalsIgnoreCase("P")) {
				// prompt user for the name of tester
				System.out.print("Enter tester name: ");
				name = input.next();

				// prompt user for the number of hours worked
				System.out.print("Enter the number of hours worked: ");
				hours = input.nextDouble();

				// call PartTimeGameTester class
				PartTimeGameTester partTimeGameTester = new PartTimeGameTester(name, hours);

				// set salary
				partTimeGameTester.setSalary();

				// display tester information
				partTimeGameTester.displayTesterInfo();
				counter++; // Counts input as right and increments to end loop
			// wrong user input
			} else {
				System.out.println("You should enter either P or F.");
			}
		} // end loop
		// close scanner
		input.close();
	} // end main
} // end class