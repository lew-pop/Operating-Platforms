package com.gamingroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * A singleton service for the game engine
 * 
 * @author Lewis Quick
 */
public class GameService {

	/**
	 * A list of the active games
	 */
	private static List<Game> games = new ArrayList<Game>();

	/*
	 * Holds the next game identifier
	 */
	private static long nextGameId = 1;

	/*
	 * Holds the next player identifier
	 */
	private static long nextPlayerId = 1;

	/*
	 * Holds the next team identifier
	 */
	private static long nextTeamId = 1;

	/**
	 * Create an object of GameService. The design of the singleton pattern will
	 * only have one instance of the GameService object because the GameService
	 * class includes a private constructor. The iterator pattern is essential for
	 * the singleton pattern because it checks whether an object already exists,
	 * preventing it from making multiple instances of an object.
	 * 
	 */
	private static GameService newGameService = new GameService();

	/**
	 * A private constructor. A private constructor prevents multiple attempts to
	 * instantiate an instance and any other additional attempts outside of the
	 * class and is necessary for singleton design pattern.
	 * 
	 */
	private GameService() {

	}

	/**
	 * A public accessor to get GameService. Allows other classes to access the
	 * GameService object. Required to access objects in the singleton class.
	 * 
	 */
	public static GameService getGameService() {
		return newGameService;
	}

	/**
	 * Construct a new game instance
	 * 
	 * @param name the unique name of the game
	 * @return the game instance (new or existing)
	 */
	public Game addGame(String name) {

		// a local game instance
		Game game = null;
		Game tmpGame = null;

		// Iterator to look for existing game with same name		
		Iterator<Game> gameIterator = games.iterator();
		while (gameIterator.hasNext()) {
			tmpGame = gameIterator.next();
			// if found return the existing instance
			if (tmpGame.getName() == name) {
				return tmpGame;
			}
		}

		// if not found, make a new game instance and add to list of games
		if (game == null) {
			game = new Game(nextGameId++, name);
			games.add(game);
		}

		// return the new/existing game instance to the caller
		return game;
	}

	/**
	 * Returns the game instance at the specified index.
	 * 
	 * @param index index position in the list to return
	 * @return requested game instance
	 */
	Game getGame(int index) {
		return games.get(index);
	}

	/**
	 * Returns the game instance with the specified id.
	 * 
	 * @param id unique identifier of game to search for
	 * @return requested game instance
	 */
	public Game getGame(long id) {

		// a local game instance
		Game game = null;
		Game tmpGame = null;

		// Iterator to look for existing game with same id
		Iterator<Game> gameIterator = games.iterator();
		while (gameIterator.hasNext()) {
			tmpGame = gameIterator.next();
			// if found assign that instance to the local variable
			if (tmpGame.getId() == id) {
				game = tmpGame;
			}
		}

		return game;
	}

	/**
	 * Returns the game instance with the specified name.
	 * 
	 * @param name unique name of game to search for
	 * @return requested game instance
	 */
	public Game getGame(String name) {

		// a local game instance
		Game game = null;
		Game tmpGame = null;

		// Iterator to look for existing game with same name
		Iterator<Game> gameIterator = games.iterator();
		while (gameIterator.hasNext()) {
			tmpGame = gameIterator.next();
			// if found assign that instance to the local variable
			if (tmpGame.getName() == name) {
				game = tmpGame;
			}
		}
		
		return game;
	}

	/**
	 * Returns the number of games currently active
	 * 
	 * @return the number of games currently active
	 */
	public int getGameCount() {
		return games.size();
	}
	
	public long getNextPlayerId() {
		return nextPlayerId;
	}
	
	public long getNextTeamId() {
		return nextTeamId;
	}
}
