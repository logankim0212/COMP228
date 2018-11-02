package application;

import java.util.Scanner;

public class BookApp {
	// main
	public static void main(String[] args) {
		// declaration & initialization
		int counter = 1;
		String title = "Blank";
		Scanner input = new Scanner(System.in);
		Book book = new Book();

		// loop for entering book title
		do
		{
			// if user does not enter empty value
			if(title != "") {
				System.out.print("Please enter the book titles up to 10.");
				System.out.printf("%nBook title #%d: ", counter);
				title = input.next();
				book.addBookTitle(title);
			}
			// if user enters nothing set counter to 0
			else
			{
				counter = 11;
			}
			counter++;
		} while (counter <= 10); // end loop
		// print random book title
		book.showBookTitle();
		// print matching book title with Trees
		book.find("Trees");
	} // end main
} // end class
