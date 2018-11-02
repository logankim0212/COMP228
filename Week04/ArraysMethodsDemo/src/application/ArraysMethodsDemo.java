package application;

public class ArraysMethodsDemo {
	public static void main(String[] args) {
		int[] numBox = { -33, 56, 100, 25, 41 };

		for (int iElem = 0; iElem < numBox.length; iElem++)
		{
			System.out.println("Element [" + iElem + "]: " + numBox[iElem]);
		}

		System.out.println("\nPrint the elements in reversed order: ");
		for (int iElem = (numBox.length - 1); iElem >= 0; iElem--)
		{
			System.out.println("Element [" + iElem + "]: " + numBox[iElem]);
		}
	} // end main

	public void printArrayElements(int[] arr) {
		for (int iElem = 0; iElem < arr.length; iElem++) {
			System.out.println("Element [" + iElem + "]: " + arr[iElem]);
		}
	}
	public void ReversedArrayElements(int[] arr) {
		for (int iElem = (arr.length - 1); iElem >= 0; iElem--) {
			System.out.println("Element [" + iElem + "]: " + arr[iElem]);
		}
	}
} // end class
