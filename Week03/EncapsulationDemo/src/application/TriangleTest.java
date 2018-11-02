package application;

public class TriangleTest {

	public static void main(String[] args) {
		// Declarations & Initializations
		Triangle tril1 = new Triangle();
		Triangle tril2 = new Triangle(40D, 15.5);

		// change the base to 5.5
		// change the height to 1
		tril1.setBase(5.5);
		tril1.setHeight(1D);

		System.out.printf("The area of the triangle with base (%.2f) and height (%.2f) is %.2f\n",
				tril1.getBase(), tril1.getHeight(), tril1.calcTriArea());
		System.out.printf("The area of the triangle with base (%.2f) and height (%.2f) is %.2f\n",
				tril2.getBase(), tril2.getHeight(), tril2.calcTriArea());

		System.out.println("The number of triangle objects: " + Triangle.s_numOfTriangle);
	}

}
