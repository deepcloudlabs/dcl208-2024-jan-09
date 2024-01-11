package com.example.service;

public class Exercise02 {

	public static void main(String[] args) {
		// Create a Rectangle and a Square
		Shape r = new Rectangle(5.0, 20.0);
		Shape s = new Square(10.0);
		// Now call the method above.
		// According to the LSP,
		// it should work for either Rectangles or
		// Squares. Does it??
		test100LSP(r);
		test100LSP(s);
	}

	public static void test100LSP(Shape shape) {
		if (shape.area() == 100.0)
			System.out.println("Looking good!");
		else
			throw new IllegalStateException("What kind of shape is this?");
	}

}

interface Shape {
	public double area();

}

interface ScalableShape {
	public Shape scale(double scaleFactor);

}

record Rectangle(double width, double height) implements Shape {

	@Override
	public double area() {
		return (width * height);
	}
}

record Square(double edge) implements Shape, ScalableShape {

	@Override
	public double area() {
		return this.edge * this.edge;
	}

	@Override
	public Shape scale(double scaleFactor) {
		return new Square(scaleFactor * this.edge);
	}

}

// record ColorfulRectangle(String color) extends Rectangle {}