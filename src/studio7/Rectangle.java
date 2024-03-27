package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	/**
	 * Constructor
	 * @param length the length of the rectangle
	 * @param width  the width of the rectangle
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	/**
	 * Accessor
	 * @return the length of the rectangle
	 */
	public double getLength() {
		return this.length;
	}
	
	/**
	 * Accessor
	 * @return the width of the rectangle
	 */
	public double getWidth() {
		return this.width;
	}
	
	/**
	 * Setter
	 * @param length sets the length of the rectangle
	 */
	public void setLength(double length) {
		this.length = length;
	}
	
	/**
	 * Setter
	 * @param width sets the width of the rectangle
	 */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/**
	 * Calculates the perimeter of the rectangle
	 * @return the perimeter
	 */
	public double perimeter() {
		return 2*(this.length + this.width);
	}
	
	/**
	 * Calculates the area of the rectangle
	 * @return the area
	 */
	public double area() {
		return this.length*this.width;
	}
	
	/**
	 * Determines whether or not the rectangle is square
	 * @return true if the rectangle is square
	 */
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}
		return false;
	}
	
	/**
	 * Determines whether the rectangle is smaller than another rectangle
	 * @param r the rectangle to compare to
	 * @return true if the rectangle is smaller
	 */
	public boolean isSmaller(Rectangle r) {
		if (this.area() < r.area()) {
			return true;
		}
		return false;
	}
	
	/**
	 * Draws the rectangle in StdDraw
	 */
	public void draw() {
		StdDraw.rectangle(0.5, 0.5, this.width/2, this.length/2);
	}
	
	/**
	 * Prints out the dimensions of the rectangle
	 */
	public String toString() {
		return this.length + "x" + this.width;
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(0.5, 0.3);
		r1.draw();
		System.out.println(r1.toString());
		r1.setWidth(0.5);
		System.out.println("Is square: " + r1.isSquare());
		Rectangle r2 = new Rectangle(0.6, 0.8);
		System.out.println("Is smaller: " + r1.isSmaller(r2));
	}

}
