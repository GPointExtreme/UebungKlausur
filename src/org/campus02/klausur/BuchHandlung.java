package org.campus02.klausur;

import java.util.ArrayList;
import java.util.HashMap;

public class BuchHandlung {

	private ArrayList<Buch> buchList = new ArrayList<Buch>();
	
	public void add(Buch b) {
		buchList.add(b);
	}
	
	public Buch getBuchByISBN(String ISBN) {
		for (Buch buch : buchList) {
			if(buch.getISBN().equals(ISBN)) {
				return buch;
			}
		}
		return null;
	}
	
	public ArrayList<Buch> getBuecherByKategorie(String kategorie) {
		ArrayList<Buch> list = new ArrayList<>();
		for (Buch buch : buchList) {
			if(buch.getKategorie().equals(kategorie)) {
				list.add(buch);
			}
		}
		return list;
	}
	
	public ArrayList<Buch> getBuecherByBewertung(int minPunkte) {
		ArrayList<Buch> list = new ArrayList<>();
		for (Buch buch : buchList) {
			if(buch.getBewertungInPunkte() >= minPunkte) {
				list.add(buch);
			}
		}
		return list;
	}
	
	public Buch getBestOfKategorie(String kategorie) {
		Buch bestBuch = null;
		for (Buch buch : buchList) {
			if(buch.getKategorie().equals(kategorie)) {
				if (bestBuch == null) {
					bestBuch=buch;
				}
				if(buch.getBewertungInPunkte() >= bestBuch.getBewertungInPunkte()) {
					bestBuch=buch;
				}
			}
		}
		return bestBuch;
	}
	
	public ArrayList<Buch> getBuecherByAutor(String autor) {
		ArrayList<Buch> list = new ArrayList<>();
		for (Buch buch : buchList) {
			String[] array = buch.getAutoren();
			for (int i = 0; i < array.length; i++) {
				if(array[i].equals(autor)) {
					list.add(buch);
				}
			}
		}
		return list;
	}
	
	public HashMap<String, Integer> countBuecherGroupByKategorie() {
		HashMap<String, Integer> map = new HashMap<>();
		for (Buch buch : buchList) {
			if (!map.containsKey(buch.getKategorie())) {
				map.put(buch.getKategorie(), 1);
			}
			else {
				Integer value = map.get(buch.getKategorie());
				map.put(buch.getKategorie(), value + 1);
			}
		}
		return map;
	}
}
