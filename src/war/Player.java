package war;

import java.util.ArrayList;
import java.util.List;

// JAVA WEEK 6 FINAL - Player class
// Written by - Joseph Falzini

public class Player {
	
	/*
	 * Player Class:
	 *  - Fields: 
	 *     # List<Card> hand - List of Card.
	 *     # int score - Player's score; set to 0 by the constructor.
	 *     # String name - Player name.
	 *     
	 *  - Methods:
	 *     # Player(String name) - class constructor, takes a String name for the Player name.
	 *     # describe() - prints out information about the player, and calls the describe method for each card in List hand.
	 *     # flip() - removes and returns the top card of the player's hand.
	 *     # draw(Deck deck) - takes a Deck as an argument and takes the top card from the deck and puts it into the player's hand.
	 *     # incrementScore() - adds 1 to the Player's total score.
	 *     # getName() - returns the player's name.
	 *     # getScore() - returns the player's score.
	 */

	private List<Card> hand = new ArrayList<Card>();
	private int score; 
	private String name;
	
	public Player(String name) {
		this.name = name;
		score = 0;
	}
	
	public void describe() {
		System.out.println("Player name: " + name);
		
		for (int i = 0; i < hand.size(); i++) {
			hand.get(i).describe();		
		}
	}
	
	public Card flip() {
		Card flipped = hand.get(0);
		hand.remove(0);
		return flipped;
	}
	
	public void draw(Deck deck) {
		Card drawn = deck.draw();
		hand.add(drawn);
	}
	
	public void incrementScore() {
		score += 1;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
}
