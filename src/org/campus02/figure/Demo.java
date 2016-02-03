package org.campus02.figure;

public class Demo {

	public static void main(String[] args) {
		Rectangle f1 = new Rectangle(10, 20);
		Rectangle f2 = new Rectangle(100, 20);
		Rectangle f3 = new Rectangle(100, 50);
		Rectangle f4 = new Rectangle(100, 100);
		
		Circle f5 = new Circle(10);
		Circle f6 = new Circle(100);
		Circle f7 = new Circle(1000);
		
		FigureManager manager = new FigureManager();
		
		manager.add(f1);
		manager.add(f2);
		manager.add(f3);
		manager.add(f4);
		manager.add(f5);
		manager.add(f6);
		manager.add(f7);
		
		System.out.println(manager.getMaxPermeter());
		
		System.out.println(manager.getAllArea());
		
		System.out.println(manager.getAreaBySizeCategories());

	}

}
