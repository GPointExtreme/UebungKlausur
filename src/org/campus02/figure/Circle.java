package org.campus02.figure;

public class Circle implements Figure {
	
	protected double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getPermeter() {
		return (radius*2)*Math.PI;
	}

	@Override
	public double getArea() {
		return Math.pow(radius, 2)*Math.PI;
	}

}
