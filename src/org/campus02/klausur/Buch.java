package org.campus02.klausur;

import java.util.Arrays;

public class Buch {

	private String ISBN;
	private String titel;
	private String[] autoren;
	private int jahr;
	private String kategorie;
	private int bewertungInPunkte;
	
	
	public Buch(String iSBN, String titel, String[] autoren, int jahr,
			String kategorie) {
		ISBN = iSBN;
		this.titel = titel;
		this.autoren = autoren;
		this.jahr = jahr;
		this.kategorie = kategorie;
	}
	

	
	public String getISBN() {
		return ISBN;
	}

	public String getTitel() {
		return titel;
	}

	public String[] getAutoren() {
		return autoren;
	}
	
	public int getJahr() {
		return jahr;
	}

	public String getKategorie() {
		return kategorie;
	}
	
	public int getBewertungInPunkte() {
		return bewertungInPunkte;
	}
	public void setBewertungInPunkte(int bewertungInPunkte) {
		this.bewertungInPunkte = bewertungInPunkte;
	} 
	
	@Override
	public String toString() {
		return "Buch [ISBN=" + ISBN + ", titel=" + titel + ", autoren="
				+ Arrays.toString(autoren) + ", jahr=" + jahr + ", kategorie="
				+ kategorie + ", bewertungInPunkte=" + bewertungInPunkte + "]";
	}
	
	
	
}
