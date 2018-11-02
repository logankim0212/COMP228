/* Logan Kim */
/* COMP228-006 */
/* Lab 2 */
/** Exercise 3:
 * Write a Java class that implements a set of three overloaded static methods. The methods should
 * have different set of parameters and perform similar functionalities. Call the methods within main
 * method and display the results.
 */
package application;

import javax.swing.JOptionPane;

public class Java {
	// main
	public static void main(String[] args)
	{
		// local variables
				String choice;
				String menu;
				String firstQ;
				String secondQ;
				String thirdQ;
				String fourthQ;
				String firstA;
				String secondA;
				String thirdA;
				String fourthA;
				String message;
				int first;
				int second;
				int third;
				int fourth;
				int result;

				// message for menu
				menu = "Choose one of the option below"
						+ "\n1) Find the mininum between 2 values"
						+ "\n2) Find the mininum between 3 values"
						+ "\n3) Find the mininum between 4 values"
						+ "\nHit any button to quit the program";

				// message for prompting integer from user
				firstQ = "Enter the first integer";
				secondQ = "Enter the second integer";
				thirdQ = "Enter the third integer";
				fourthQ = "Enter the fourth integer";

				// print menu
				choice = JOptionPane.showInputDialog(menu);

				// switch for an each option
				switch(choice) {
				// min between 2 values
				case "1":
					// prompt first integer and convert it from string to integer
					firstA = JOptionPane.showInputDialog(firstQ);
					first = Integer.parseInt(firstA);

					// prompt second integer and convert it from string to integer
					secondA = JOptionPane.showInputDialog(secondQ);
					second = Integer.parseInt(secondA);

					// calculate result with min method
					result = Java.min(first, second);

					// format message
					message = "Minimum value between " + first + ", " + second + " is " + result;

					// print the result
					JOptionPane.showMessageDialog(null, message);

					// exit program
					System.exit(0);
					break;
					// min between 3 values
				case "2":
					// prompt first integer and convert it from string to integer
					firstA = JOptionPane.showInputDialog(firstQ);
					first = Integer.parseInt(firstA);

					// prompt second integer and convert it from string to integer
					secondA = JOptionPane.showInputDialog(secondQ);
					second = Integer.parseInt(secondA);

					// prompt third integer and convert it from string to integer
					thirdA = JOptionPane.showInputDialog(thirdQ);
					third = Integer.parseInt(thirdA);

					// calculate result with min method
					result = Java.min(first, second, third);

					// format message
					message = "Minimum value between " + first + ", " + second + ", " + third + " is " + result;

					// print the result
					JOptionPane.showMessageDialog(null, message);

					// exit program
					System.exit(0);
					break;
					// min between 4 values
				case "3":
					// prompt first integer and convert it from string to integer
					firstA = JOptionPane.showInputDialog(firstQ);
					first = Integer.parseInt(firstA);

					// prompt second integer and convert it from string to integer
					secondA = JOptionPane.showInputDialog(secondQ);
					second = Integer.parseInt(secondA);

					// prompt third integer and convert it from string to integer
					thirdA = JOptionPane.showInputDialog(thirdQ);
					third = Integer.parseInt(thirdA);

					// prompt fourth integer and convert it from string to integer
					fourthA = JOptionPane.showInputDialog(fourthQ);
					fourth = Integer.parseInt(fourthA);

					// calculate result with min method
					result = Java.min(first, second, third, fourth);

					// format message
					message = "Minimum value between " + first + ", " + second + ", " + third + ", " + fourth + " is " + result;

					// print the result
					JOptionPane.showMessageDialog(null, message);

					// exit program
					System.exit(0);
					break;
					// hit any key to exit
				default:
					// exit program
					System.exit(0);
					break;
				} // end switch
	} // end main

	// method for finding a minimum value from 2 values
	public static int min(int num1, int num2) {
		// find the smaller value and return it
		return Math.min(num1, num2);
	}// end min

	// method overloading from 3 values
	public static int min(int num1, int num2, int num3) {
		// find the smaller value and return it
		return Math.min(Math.min(num1, num2), num3);
	} // end min

	// method overloading from 4 values
	public static int min(int num1, int num2, int num3, int num4) {
		// find the smaller value and return it
		return Math.min(Math.min(Math.min(num1, num2), num3), num4);
	} // end min
} // end class