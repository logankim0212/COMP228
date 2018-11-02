/* Logan Kim */
/* COMP228-006 */
/* Lab 2 */
/** Exercise 1:
 * Write a Java application that simulates a test. The test contains at least five questions about first three lectures
 * of this course. Each question should be a multiple-choice question with 4 options.
 * Design a Test class. Use programmer-defined methods to implement your solution. For example:
 * - create a method to simulate the questions – simulateQuestion
 * - create a method to check the answer – checkAnswer
 * - create a method to display a random message for the user – generateMessage
 * - create a method to interact with the user - inputAnswer
 *
 * Display the questions using methods of JOptionPane class. Use a loop to show all the questions.
 *
 * For each question:
 * - If the user finds the right answer, display a random congratulatory message
 *   (“Excellent!”,”Good!”,”Keep up the good work!”, or “Nice work!”).
 * - If the user responds incorrectly, display an appropriate message and the correct answer
 *   (“No. Please try again”, “Wrong. Try once more”, “Don't give up!”, “No. Keep trying..”)
 * - Use random-number generation to choose a number from 1 to 4 that will be used to select
 *   an appropriate response to each answer.
 * - Use a switch statement to issue the responses, as in the following code:
 *   switch ( randomObject.nextInt( 4 ) )
 *   {
 *   case 0:
 *   return( "Very good!" );
 *   ...... }
 *
 *   At the end of the test display the number of correct and incorrect answers, and the percentage of the correct answers.
 *
 *   Your main class will simply create a Test object and start the test by calling inputAnswer method.
 */
package application;

import java.util.Random;

import javax.swing.JOptionPane;

public class Test {
	// field arrays
	private String[] _question = new String[5];
	private int[] _answer = new int[5];

	// main
	public static void main(String[] args)
	{
		// creating object test
		Test test = new Test();

		// call method inputAnswer with an object test
		test.inputAnswer();
	} // end main

	// method for simulating question
	private void simulateQuestion() {
		// create questions
		_question[0] = "Question 01"
				+ "\nWhat does JDK stand for?"
				+ "\n1) Java Developer Kit"
				+ "\n2) JavaScript Developer Kit"
				+ "\n3) Java Development Kit"
				+ "\n4) JavaScript Development Kit"
				+ "\n5) None of this above";
		_question[1] = "Question 02"
				+ "\nWhich is the correct way to write a method?"
				+ "\n1) public void helloWorld() { }"
				+ "\n2) Public void helloWorld() { }"
				+ "\n3) public void helloWorld(string hello) {}"
				+ "\n4) public void helloWorld{} [ ]"
				+ "\n5) Public void helloWorld[] { }";
		_question[2] = "Question 03"
				+ "\nWhich one is not a Math class static method?"
				+ "\n1) abs(x)"
				+ "\n2) ceil(x)"
				+ "\n3) floor(x)"
				+ "\n4) max(x, y)"
				+ "\n5) minimum(x, y)";
		_question[3] = "Question 04"
				+ "\nChoose the wrong one."
				+ "\n1) byte -> 8 bits"
				+ "\n2) short -> 16 bits"
				+ "\n3) long -> 64 bits"
				+ "\n4) double -> 128 bits"
				+ "\n5) int -> 32 bits";
		_question[4] = "Question 05"
				+ "\nChoose the wrong one"
				+ "\n1) A floating-point number is a number with a decimal point."
				+ "\n2) Floating-point literals are of type int by default."
				+ "\n3) Java provides two primitive types for storing floating-point numbers in memory - float and double."
				+ "\n4) Variables of type double represent double-precision floating-point numbers."
				+ "\n5) None of the above";
	} // end simulateMethod

	// method for checking Answer
	private String checkAnswer(int counter, int answer) {
		// create answer
		_answer[0] = 3;
		_answer[1] = 1;
		_answer[2] = 5;
		_answer[3] = 4;
		_answer[4] = 2;

		// local variable
		String result = null;

		// switch for checking answer
		switch(answer) {
		// check if user input is 1 - 5
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			// check if user is correct then return true
			if(answer == _answer[counter])
			{
				result = "true";
			}
			// as user is incorrect, return false
			else
			{
				result = "false";
			}
			break;
		// return null since wrong input
		default:
			break;
		}
		return result;
	}

	// method for generating message
	private String generateMessage(String input) {
		// local variable
		String answer = null;

		// create random object
		Random randomObject = new Random();

		// if user is correct
		if(input == "true")
		{
			// print one of the messages randomly
			switch(randomObject.nextInt(4)) {
			case 0:
				answer = "Excellent!";
				break;
			case 1:
				answer = "Good!";
				break;
			case 2:
				answer = "Keep up the good work!";
				break;
			case 3:
				answer = "Nice work!";
				break;
			}
		}
		// if user is incorrect
		else if (input == "false")
		{
			// print one of the messages randomly
			switch(randomObject.nextInt(4)) {
			case 0:
				answer = "No. Please try again.";
				break;
			case 1:
				answer = "Wrong. Try once more.";
				break;
			case 2:
				answer = "Don't give up!";
				break;
			case 3:
				answer = "No. Keep trying.";
				break;
			}
		}
		// if user entered wrong input
		else
		{
			// print the message for user to try again
			answer = "You've entered the wrong value. "
					+ "Please try it again.";
		}
		return answer;
	}

	// method for input answer
	private void inputAnswer() {
		// local variables
		String answer;
		int answerInt;
		String check;
		String message;
		int correct = 0;
		int incorrect;
		double result;
		String finalMessage;

		simulateQuestion();

		// loop for displaying each question one by one
		for(int counter = 0; counter <= 4; )
		{
			// print question and prompt user for an input
			answer = JOptionPane.showInputDialog(_question[counter]);

			// convert string to integer
			answerInt = Integer.parseInt(answer);

			//check if the answer is correct, incorrect, or wrong input
			check = checkAnswer(counter, answerInt);

			// generate message which showing if user if right or wrong
			message = generateMessage(check);
			JOptionPane.showMessageDialog(null, message);

			// if the user is correct, move to next question and count is as correct
			if (check == "true")
			{
				counter++;
				correct++;
			}
			// if the user is incorrect, just move to next question
			else if (check == "false")
			{
				counter++;
			}
		}

		// calculating user's score
		result = ((double)correct / 5) * 100;

		// print user's result
		incorrect = 5 - correct;
		finalMessage = "You got " + correct + " right, " + incorrect + " wrong. Your score is " + correct + "/5: " + result + "%";
		JOptionPane.showMessageDialog(null, finalMessage);

		// exit program
		System.exit(0);
	} // end inputAnswer
} // end class
