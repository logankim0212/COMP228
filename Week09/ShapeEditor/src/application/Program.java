package application;

public class Program {
	public static void main(String[] args) {
		// Declarations & Initializations
//		Shape shape1 = new Shape();
		Circle c1 = new Circle();
		Circle c2 = new Circle(7.65, new Point(5,5));
		Line line1 = new Line(new Point(0,0), new Point(0,8));
		Shape sh = null;

		// set the values for Shape
//		shape1.setName("Undefined");
//		shape1.setColour("Blank");

		// set the values for c1
		c1.setName("Circle 1");
		c1.setColour("Blue");
		c1.setRadius(5.5);

		// set the values for c2
		c2.setName("Circle 2");
		c2.setColour("Red");

		// set the values for line1
		line1.setName("Line 1");
		line1.setColour("White");

		// assign line1 to shape
		// up-cast (assign the object of the subclass to the superclass)
		sh = line1;

		// draw the shapes
//		shape1.draw();
		c1.draw();
		c2.draw();
		sh.draw();

		// an array of type Shape
		Shape[] shapeList = {c1, line1, c2};
		System.out.println("**Drawing the Painting**");
		Painting p1 = new Painting(shapeList);

		p1.draw();
	}
}
