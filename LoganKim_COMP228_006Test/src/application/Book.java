package application;

import java.util.Random;
import java.util.ArrayList;


public class Book {
	// declaration & initialization
	private static final int _MAXBOOKNUMBER = 10;
	private String[] _bookTitles = new String[_MAXBOOKNUMBER];
    ArrayList<String> _array = new ArrayList<String>();
	private int i = 0;
	private int counter = 0;

	// add Book Title
	public void addBookTitle(String title) {
		// loop for adding book title
		for(i = 0; i < 10; i++) {
			_bookTitles[i] = title;
			_array.add(_bookTitles[i]);
		}
	} // end addBookTitle

	// show random book title
	public void showBookTitle() {
		// create random object
		Random randomObject = new Random();
		// display random book title
		System.out.println("Random book title: " + _bookTitles[randomObject.nextInt(i + 1)]);
	} // end showBookTitle

	// find book title
	public void find(String substring) {
	      System.out.println(_array.indexOf(substring));
	} // end find
} // end class
