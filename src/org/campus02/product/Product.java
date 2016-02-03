package org.campus02.product;

import java.util.ArrayList;

public class Product {
	
	public String name;
	public ArrayList<Product> parts = new ArrayList<>();
	public double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void add(Product p) {
		parts.add(p);
	}

	public void setParts(ArrayList<Product> parts) {
		this.parts = parts;
	}
	
	public double gesamtPreis() {
		double gesamtpreis = price;
		for (Product product : parts) {
			gesamtpreis += product.gesamtPreis();
		}
		return gesamtpreis;
	}

	public String gesamtParts(Product p, String i) {
		if(p.parts.contains(null)) {
			return i + p.name + " " + p.price + "\n";
		}
		String par = i + p.name + " " + p.price + "\n";
		i += " ";
		for (Product product : p.parts) {
			par += gesamtParts(product, i);
		}
		return par;
	}
	

}
