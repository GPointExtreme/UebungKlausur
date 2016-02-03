package org.campus02.eventKalender;

public class EventDemo {

	public static void main(String[] args) {
		EventKalender kalender = new EventKalender();
		
		Event ACDC = new Event("ACDC", "Wien", 100);
		kalender.add(ACDC);
		Event NovaRock = new Event("NovaRock", "Wien", 80);
		kalender.add(NovaRock);
		Event Metallica = new Event("Metallica", "Wien", 70);
		kalender.add(Metallica);
		Event Alligatoah = new Event("Alligatoah", "Graz", 40);
		kalender.add(Alligatoah);
		Event SnapDazeD = new Event("SnapDazeD", "Graz", 30);
		kalender.add(SnapDazeD);
		
		System.out.println(kalender.getByTitle("ACDC"));
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(kalender.getByEintrittsPreis(50, 90));
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(kalender.getByOrt("Graz"));
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(kalender.getMostExpensiveByOrt("Wien"));
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(kalender.getAvgPreisByOrt("Graz"));
		System.out.println("-------------------------------------------------------------");
		
		System.out.println(kalender.getCountByOrt());

	}

}
