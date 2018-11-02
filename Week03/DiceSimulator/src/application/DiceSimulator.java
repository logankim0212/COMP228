package application;

import java.util.Random;

public class DiceSimulator {
	public static void main(String[] args)
	{
		// Declarations & Initializations
		DiceSimulator self = new DiceSimulator();
		int sum = 0; // represent the total rolls

		// repeat for 1 - 20 rolls
		for(int iRoll = 0; iRoll < 20; iRoll++) {
			sum += self.rollDice();
		}
		System.out.println("The average value over 20 rolls is " + (sum/20.0));
	} // end main

	public int rollDice() {
		// Declaration & Initializations
		Random rnd = new Random();
		int rndValue; // represents a random integer between (1 - 6)

		// generate the value
		rndValue = rnd.nextInt(6) + 1;

		return rndValue;
	} // end roolDice

} // end class DiceSimulator
