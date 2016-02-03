package org.campus02.figure;

public class Rectangle implements Figure{

	protected double lenght;
	protected double width;

	public Rectangle(double lenght, double width) {
		super();
		this.lenght = lenght;
		this.width = width;
	}

	@Override
	public double getPermeter() {
		return (lenght+width)*2;
	}

	@Override
	public double getArea() {
		return lenght*width;
	}

}
