package org.campus02.product;

import java.util.ArrayList;

public class ProductDemo {

	public static void main(String[] args) {
		
		Product glas = new Product("Glas", 18);
		Product sensor = new Product("Sensor", 5);
		
		ArrayList<Product> bildschirmParts = new ArrayList<>();
		bildschirmParts.add(sensor);
		bildschirmParts.add(glas);
		
		Product bildschirm = new Product("Bildschirm", 10);
		bildschirm.setParts(bildschirmParts);
		
		
		Product akku = new Product("Akku", 20);
		ArrayList<Product> caseParts = new ArrayList<>();
		caseParts.add(akku);
		
		Product caseHülle = new Product("Hülle", 10);
		caseHülle.setParts(caseParts);
		
		Product MacBook = new Product("MacBook", 0.0);
		ArrayList<Product> MacParts = new ArrayList<>();
		MacParts.add(caseHülle);
		MacParts.add(bildschirm);
		
		MacBook.setParts(MacParts);
		
		System.out.print(MacBook.gesamtParts(MacBook, ""));

	}

}
