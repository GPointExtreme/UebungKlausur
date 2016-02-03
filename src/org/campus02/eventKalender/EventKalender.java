package org.campus02.eventKalender;

import java.util.ArrayList;
import java.util.HashMap;

public class EventKalender {
	
	ArrayList<Event> events = new ArrayList<>();
	
	public void add(Event e) {
		events.add(e);
	}
	
	public Event getByTitle(String title) {
		for (Event event : events) {
			if(event.getTitle().equals(title)) {
				return event;
			}
		}
		return null;
	}
	
	public ArrayList<Event> getByOrt(String ort) {
		ArrayList<Event> list = new ArrayList<>();
		for (Event event : events) {
			if(event.getOrt().equals(ort)) {
				list.add(event);
			}
		}
		return list;
	}
	
	public ArrayList<Event> getByEintrittsPreis(double min, double max) {
		ArrayList<Event> list = new ArrayList<>();
		for (Event event : events) {
			if(event.getEintrittspreis() > min && event.getEintrittspreis() < max) {
				list.add(event);
			}
		}
		return list;
	}
	
	public Event getMostExpensiveByOrt(String ort) {
		ArrayList<Event> list = getByOrt(ort);
		double max = 0.0;
		Event Emax = null;
		for (Event event : list) {
			if(event.getEintrittspreis() >= max) {
				max = event.getEintrittspreis();
				Emax = event;
			}
		}
		return Emax;
	}
	
	public double getAvgPreisByOrt(String ort) {
		ArrayList<Event> list = getByOrt(ort);
		double gesamt = 0.0;
		for (Event event : list) {
			gesamt += event.getEintrittspreis();
		}
		return gesamt/list.size();
	}
	
	public HashMap<String, Integer> getCountByOrt() {
		HashMap<String, Integer> map = new HashMap<>();
		for (Event event : events) {
			if(!map.containsKey(event.getOrt())) {
				map.put(event.getOrt(), 1);
			}
			else {
				Integer value = map.get(event.getOrt());
				map.put(event.getOrt(), value + 1);
			}
		}
		return map;
	}

}
