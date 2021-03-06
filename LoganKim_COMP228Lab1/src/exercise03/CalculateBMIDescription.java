/** Calculate BMI Description. java
 * author: Logan Kim
 * purpose: Develop a java application to calculate Body Mass Index (BMI) as well as the description that indicates if the one is underweight, normal, overweight, or obese.
 */
package exercise03;

import java.util.Scanner; // used to scan values

public class CalculateBMIDescription {
	// field variables
	private int _value; // represents the value for the loop
	private double _pounds; // represents the weight entered by the user
	private double _feet; // represents the height(feet) entered by the user
	private double _inches; // represents the height(inches) entered by the user
	private double _weight; // represents the weight in kilograms
	private double _height; // represents the height in meters
	private double _bmi; // represents the result of the BMI calculation

	public static void main(String[] args)
	{
		// initializations
		Scanner input = new Scanner(System.in);
		CalculateBMIDescription self = new CalculateBMIDescription();

		// application description
		System.out.println("This application will calculate Body Mass Index(BMI).");

		// loop begins
		do
		{
			// prompt the user for his/her weight in pounds
			System.out.print("Enter your weight (in pounds): ");
			self._pounds = input.nextDouble();

			// prompt the user for his/her height in feet and inches
			System.out.print("Enter your height (in feet and inches as 5 11): ");
			self._feet = input.nextDouble();
			self._inches = input.nextDouble();

			// convert pounds to kilograms, feet & inches to meters
			self._weight = self._pounds * 0.453;
			self._height = self._feet * 0.304 + self._inches * 0.0254;

			// calculate BMI
			self._bmi = self._weight / Math.pow(self._height, 2);

			// display the result with calculateBmiDesctiption method
			System.out.printf("Your Body Mass Index is %.2f. You are %s", self._bmi, self.calculateBmiDescription());

			// prompt the user if he/she wants to continue
			System.out.print("\nDo you want to continue? (If no, type 0 / If yes, type any integer): ");
			self._value = input.nextInt();
		} while (self._value != 0); // end loop

		// goodbye message
		System.out.print("Thank you! See you next time!");

		input.close();
	} // end main

	// method for BMI Description
	public String calculateBmiDescription()
	{
		// conditions
		if (_bmi < 18.5)
		{
			return "underweight";
		}
		else if (_bmi >= 18.5 && _bmi < 25)
		{
			return "normal";
		}
		else if (_bmi >= 25 && _bmi < 30)
		{
			return "overweight";
		}
		else
		{
			return "obese";
		}
	} // end calculateBmiDescription
} // end class
