package com.gamingroom;

/**
 * Class to hold information about a player
 * 
 * Note: Overloaded constructor that requires
 * an id and name to be passed when creating.
 * No mutators (setters) defined so these
 * values cannot be changed once a player is
 * created.
 * 
 * @author Lewis Quick
 *
 */
public class Player extends Entity{
	
	/*
	 * A public constructor with id and name to create a Player object.
	 */
	public Player(long id, String name) {
		super(id, name);
	}

	@Override
	public String toString() {
		return "Player [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
}
