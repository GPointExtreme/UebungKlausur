package org.campus02.blackjack;

import java.util.HashMap;

public class BlackJack {
	
	private HashMap<Player, Integer> players = new HashMap<>();
	
	public boolean add(Player player) {
		if(!players.containsKey(player)) {
			players.put(player, 0);
			return true;
		}
		else return false;
	}
	
	public boolean addCard(Player player, Integer valueCard) {
		if(players.containsKey(player)) {
			Integer value = players.get(player);
			players.put(player, value + valueCard);
			return true;
		}
		else return false;
	}
	
	public Integer getValue(Player player) {
		if(players.containsKey(player)) {
			Integer value = players.get(player);
			return value;
		}
		else return null;
	}

	@Override
	public String toString() {
		String result = "";
		
		for (Player player : players.keySet()) {
			result += player.getName() + ", Kartenwert: " + getValue(player) + "\n";
		}
		return result;
	}
	
}
