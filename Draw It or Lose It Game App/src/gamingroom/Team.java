package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Class to hold information about a team
 * 
 * Note: Overloaded constructor that requires
 * an id and name to be passed when creating.
 * No mutators (setters) defined so these
 * values cannot be changed once a team is
 * created.
 * 
 * @author Lewis Quick
 *
 */
public class Team extends Entity{
	
	/*
	 * An ArrayList to hold a list of players.
	 * 
	 */
	private List<Player> players = new ArrayList<Player>();
	
	/*
	 * A public constructor with id and name to create a Team object. 
	 * 
	 */
	public Team(long id, String name) {
		super(id, name);
		
	}
	
	/*
	 * A function to add a player to the ArrayList using an iterator to ensure that each team is unique.
	 * 
	 */
	public Player addPlayer(String name) {
		Player player = null;
		Player tmpPlayer = null;
		
		// Iterator to iterate over an Array of players on a team.
		Iterator<Player> playersIterator = players.iterator();
		while (playersIterator.hasNext()) {
			tmpPlayer = playersIterator.next();

			if (tmpPlayer.getName() == name) {
				return tmpPlayer;
			}
			else {
				players.add(player);
			}
		}
	
		// return the player instance
		return player; 
	}


	@Override
	public String toString() {
		return "Team [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
}
