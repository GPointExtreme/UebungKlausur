package org.campus02.primzahl;

public class Primzahl {

	public static void main(String[] args) {
		System.out.println(primzahlen(6, 2));
		

	}
	
	public static boolean primzahlen (int zahl, int counter) {
		if(zahl/2 == counter) {
			return true;
		}
		if(zahl%counter==0) {
			return false;
		}
		return primzahlen(zahl, counter+1);	
	}

}
