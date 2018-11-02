package application;

import java.util.Scanner;

public class ForeEachDemo {
	public static void main(String[] args)
	{
		// Declarations & Initializations
		Scanner input = new Scanner(System.in);
		String[] nameList = new String[5]; // represents the array of names
		int numOfNames; // user requested number of values

		System.out.print("How many names do you want: ");
		numOfNames = input.nextInt();

		// initialize the array object
		nameList = new String[numOfNames];

		for(int iElem = 0; iElem < nameList.length; iElem++) {
			System.out.print("Enter the name [" + iElem + "]: ");
			nameList[iElem] = input.nextLine(); // to scan a string
		}

		// repeat for each name in the array
		for(String name: nameList) {
			System.out.println(name);
		}
	} // end main
} // end class
