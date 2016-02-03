package org.campus02.figure;

import java.util.ArrayList;
import java.util.HashMap;

public class FigureManager {
	
	protected ArrayList<Figure> list = new ArrayList<>();
	
	public void add(Figure f) {
		list.add(f);
	}
	
	public double getMaxPermeter() {
		double max = 0.0;
		for (Figure figure : list) {
			if(figure.getPermeter()>max) {
				max=figure.getPermeter();
			}
		}
		return max;
	}
	
	public double getAllArea() {
		double all = 0.0;
		for (Figure figure : list) {
			all+=figure.getArea();
		}
		return all/list.size();
	}
	
	public HashMap<String, Double> getAreaBySizeCategories() {
		HashMap<String, Double> map = new HashMap<>();
		map.put("Klein", 0.0);
		map.put("Mittel", 0.0);
		map.put("Groß", 0.0);
		for (Figure figure : list) {
			if(figure.getArea()<=1000) {
				Double value = map.get("Klein");
				map.put("Klein", value + figure.getArea());
			}
			if(figure.getArea()>1000 && figure.getArea()<=4999) {
				Double value = map.get("Mittel");
				map.put("Mittel", value + figure.getArea());
			}
			if(figure.getArea()>=5000) {
				Double value = map.get("Groß");
				map.put("Groß", value + figure.getArea());
			}
		}
		return map;
	}

}
