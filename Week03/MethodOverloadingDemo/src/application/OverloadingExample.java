package application;

public class OverloadingExample {
	public static int max(int num1, int num2) {
		// find the bigger value and return it
		if(num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	} // end of the max method

	// method overloading
	public static double max(double num1, double num2) {
		// find the bigger value and return it
		return (num1 > num2)? num1 : num2;
	}// end of the max method
	public static int max(int num1, int num2, int num3) {
		// find the bigger value and return it
		return max(max(num1, num2), num3);
	} // end of the max method

	public static void main(String[] arg)
	{
		System.out.println("The max value (67, 598) is : " + OverloadingExample.max(67, 598));
		System.out.println("The max value (4.6, 1.45) is : " + OverloadingExample.max(4.6, 1.45));
		System.out.println("The max value (67, 598, 132) is : " + OverloadingExample.max(67, 598, 132));
	}


} // end of the class
