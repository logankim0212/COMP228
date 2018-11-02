package application;

import java.util.Arrays;

public class ArraysUtilDemo {
	public static void main(String[] args)
	{
		// Declarations & Initializations
		int[] numBox = { -33, 56, 100, 25, 41 };

		// print the elements of numBox
		System.out.println("Array elements " + Arrays.toString(numBox));

		// sort the elements of the array in ascending
		Arrays.sort(numBox);

		System.out.println("Sorted array elements " + Arrays.toString(numBox));

		// Resize numBox
		int[] bigNumBox = Arrays.copyOf(numBox, 10);
	}
}
