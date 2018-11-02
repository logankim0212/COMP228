/** Calculate Division. java
 * author: Logan Kim
 * purpose: Develop a java application to calculate division and see if it is divisible by both 5 and 6, neither of them, or just one of them.
 */
package exercise02;

import java.util.Scanner; // used to scan values

public class CalculateDivision {
	public static void main(String[] args)
	{
		// local variables
		int value; // represents the value entered by the user
		int loop; // represents the value for the loop
		double five; // represents the remainder after divided by 5
		double six; // represents the remainder after divided by 6

		// initialization
		Scanner input = new Scanner(System.in);

		// application description
		System.out.println("This application will check if the integer that you enter is divisible by both 5 and 6, neither of them, or just one of them.");

		// loop begins
		do
		{
			// prompt the user to enter an integer
			System.out.print("Enter an integer: ");
			value = input.nextInt();

			// calculate remainders
			five = value % 5;
			six = value % 6;

			// condition statements
			if (five == 0 && six == 0)
			{
				System.out.printf("%d is divisible by both 5 and 6.", value);
			}
			else if (five != 0 && six != 0)
			{
				System.out.printf("%d is not divisible by either 5 or 6.", value);
			}
			else
			{
				System.out.printf("%d is divisible by 5 or 6, but not both.", value);
			}

			// prompt the user if he/she wants to continue
			System.out.print("\nDo you want to continue? (If no, type 0 / If yes, type any integer): ");
			loop = input.nextInt();
		} while (loop != 0); // end loop

		// goodbye message
		System.out.print("Thank you! See you next time!");

		input.close();
	} // end main
} // end class
