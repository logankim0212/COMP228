package application;

public abstract class Shape {
	private String _name;
	private String _colour;

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
}
