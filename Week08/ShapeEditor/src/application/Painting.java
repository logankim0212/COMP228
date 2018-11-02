package application;

import java.util.Arrays;

public class Painting extends Shape{
	private Shape[] _shapeList = new Shape[3];

	public Painting(Shape[] list) {
		this._shapeList = Arrays.copyOf(list, list.length);
	}

	@Override
	public void draw() {
		for(Shape shape: this._shapeList) {
			shape.draw();
		}
	}
}
