package org.campus02.stringDrehen;

public class StringDrehen {
	
	public static void main(String[] args) {
		drehen("qwertz");
		

	}

	public static void drehen(String satz) {
	if(satz.length() > 0) {
		System.out.print(satz.charAt(satz.length()-1));
		drehen(satz.substring(0, satz.length()-1));
		}
	}

}
