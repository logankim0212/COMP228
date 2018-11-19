package application;

public abstract class Shape implements Comparable<Shape> {
	protected String _name;
	protected String _colour;

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getColour() {
		return _colour;
	}

	public void setColour(String colour) {
		this._colour = colour;
	}

	public abstract void draw();

	@Override
	public int compareTo(Shape other) {
		// sort two shapes based on their name (alphabetical order)
		return other._name.compareTo(this._name);
	}
}
