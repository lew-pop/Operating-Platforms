package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A simple class to hold information about a game
 * 
 * Note: Overloaded constructor that requires an id and name to be passed
 * when creating. No mutators (setters) defined so these values cannot
 * be changed once a game is created.
 * 
 * @author Lewis Quick
 *
 */
public class Game extends Entity {

	/*
	 * An ArrayList to hold a list of teams.
	 * 
	 */
	private List<Team> teams = new ArrayList<Team>();

	/**
	 * Constructor with an identifier and name
	 */
	public Game(long id, String name) {
		super(id, name);
	}

	/*
	 * A function to add a team to the ArrayList using an iterator to ensure that
	 * each team is unique.
	 * 
	 * 
	 */
	public Team addTeam(String name) {
		Team team = null;
		Team tmpTeam = null;

		Iterator<Team> playersIterator = teams.iterator();
		while (playersIterator.hasNext()) {
			tmpTeam = playersIterator.next();

			if (tmpTeam.getName() == name) {
				return tmpTeam;
			} else {
				teams.add(team);
			}
		}
 		// return the team instance
		return team;
	}

	@Override
	public String toString() {

		return "Game [id=" + super.getId() + ", name=" + super.getName() + "]";
	}

}
