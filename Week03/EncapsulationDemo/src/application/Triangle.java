package application;

public class Triangle {
	public static int s_numOfTriangle;
	private double _base; // represents the base of a triangle
	private double _height; // represents the height of a triangle

	// constructor
	public Triangle() {
		// this._base = 1.0;
		// this._height = 1.0;

		// reference the parameterized constructor of the class
		this(1.0, 1.0);
		// s_numOfTriangle++;
	}
	// overloaded method
	public Triangle(double newBase, double newHeight) {
		this._base = newBase;
		this._height = newHeight;
		
		// updating the count of triangle object
		s_numOfTriangle++;
	}

	// getter for base
	public double getBase() {
		return this._base;
	}
	// setter for base
	public void setBase(double newBase) {
		this._base = newBase;
	}

	// getter for height
	public double getHeight() {
		return this._height;
	}
	// setter for height
	public void setHeight(double newHeight) {
		this._height = newHeight;
	}

	// calculate Triangle Area
	public double calcTriArea() {
		return ( this._base * this._height ) / 2;
	}
} // end class Triangle
