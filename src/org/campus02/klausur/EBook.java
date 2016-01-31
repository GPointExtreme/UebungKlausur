package org.campus02.klausur;

public class EBook extends Buch {
	
	private String[] formaten;

	public EBook(String iSBN, String titel, String[] autoren, int jahr, String kategorie, String[] formaten) {
		super(iSBN, titel, autoren, jahr, kategorie);
		this.formaten = formaten;
	}

	public String[] getFormaten() {
		return formaten;
	}

}
