package org.campus02.klausur;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import junit.framework.Assert;

import org.junit.Test;


public class KlausurTest {

	Buch b1, b2, b3;

	@Test
	public void testGetBuchById() {
		BuchHandlung bh = createBuchHandlung();
		
		Buch b = bh.getBuchByISBN("123");
		Assert.assertEquals(b1, b);
	}

	@Test
	public void testGetBuchById_2() {
		BuchHandlung bh = createBuchHandlung();
		
		Buch b = bh.getBuchByISBN("000");
		Assert.assertNull(b);
	}

	@Test
	public void testBuecherByAutor() {
		BuchHandlung bh = createBuchHandlung();
		
		ArrayList<Buch> buecher = bh.getBuecherByAutor("Susi");
		Assert.assertNotNull(buecher);
		Assert.assertEquals(2, buecher.size());
		
		ArrayList<String> isbn = new ArrayList<String>();
		for(Buch buch: buecher) {
			isbn.add(buch.getISBN());
		}
		
		Collections.sort(isbn);
		
		Assert.assertEquals("123", isbn.get(0));
		Assert.assertEquals("456", isbn.get(1));
	}
	
	@Test
	public void testBuecherByBewertung() {
		BuchHandlung bh = createBuchHandlung();
		
		ArrayList<Buch> buecher = bh.getBuecherByBewertung(3);
		Assert.assertNotNull(buecher);
		Assert.assertEquals(2, buecher.size());
		
		ArrayList<String> isbn = new ArrayList<String>();
		for(Buch buch: buecher) {
			isbn.add(buch.getISBN());
		}
		
		Collections.sort(isbn);
		
		Assert.assertEquals("123", isbn.get(0));
		Assert.assertEquals("456", isbn.get(1));
	}
	
	@Test
	public void testBuecherByKategorie() {
		BuchHandlung bh = createBuchHandlung();
		
		ArrayList<Buch> buecher = bh.getBuecherByKategorie("A");
		Assert.assertNotNull(buecher);
		Assert.assertEquals(2, buecher.size());
		
		ArrayList<String> isbn = new ArrayList<String>();
		for(Buch buch: buecher) {
			isbn.add(buch.getISBN());
		}
		
		Collections.sort(isbn);
		
		Assert.assertEquals("123", isbn.get(0));
		Assert.assertEquals("456", isbn.get(1));
	}
	
	@Test
	public void testBestOfKategorie() {
		BuchHandlung bh = createBuchHandlung();
		
		Buch buch = bh.getBestOfKategorie("A");
		Assert.assertNotNull(buch );
		
		Assert.assertEquals("123", buch.getISBN());
	}
	
	@Test
	public void testCountBuecherGroupByKategorie() {
		BuchHandlung bh = createBuchHandlung();
		
		HashMap<String,Integer> kats = bh.countBuecherGroupByKategorie();
		Assert.assertNotNull(kats);
		Assert.assertEquals(new Integer(2), kats.get("A"));
		Assert.assertEquals(new Integer(1), kats.get("B"));
	}

	
	private BuchHandlung createBuchHandlung() {
		b1 = new Buch("123", "Waldbrand auf hoher See", new String[] { "Max", "Susi" },2012, "A");
		b1.setBewertungInPunkte(5);

		b2 = new Buch("456", "Schwammerlsuchen auf hoher See", new String[] { "Susi", "Max" },2011, "A");
		b2.setBewertungInPunkte(4);
		
		b3 = new Buch("789", "Dauerlauf auf hoher See", new String[] { "Anna", "Rudi" },2010, "B");
		b3.setBewertungInPunkte(2);
		
		BuchHandlung bh = new BuchHandlung(); 
		bh.add(b1);
		bh.add(b2);
		bh.add(b3);
		return bh;
	}
	
}
