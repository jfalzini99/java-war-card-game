package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// JAVA WEEK 6 FINAL - Deck class
// Written by - Joseph Falzini

public class Deck {
	
	/*
	 * Deck Class:
	 *  - Fields: 
	 *     # List<Card> deckOfCards - List of Object-type Card.
	 *     
	 *  - Methods:
	 *     # Deck() - Deck class constructor; no input parameters; creates a deck of cards (not including Jokers).
	 *     # shuffle() - shuffles/randomizes the order of the cards.
	 *     # draw() - removes and returns the top card of the List of Card. 
	 */

	private List<Card> deckOfCards = new ArrayList<Card>();
	
	public Deck() {
		//Clubs
		deckOfCards.add(new Card("Ace of Clubs", 14));
		deckOfCards.add(new Card("One of Clubs", 1));
		deckOfCards.add(new Card("Two of Clubs", 2));
		deckOfCards.add(new Card("Three of Clubs", 3));
		deckOfCards.add(new Card("Four of Clubs", 4));
		deckOfCards.add(new Card("Five of Clubs", 5));
		deckOfCards.add(new Card("Six of Clubs", 6));
		deckOfCards.add(new Card("Seven of Clubs", 7));
		deckOfCards.add(new Card("Eight of Clubs", 8));
		deckOfCards.add(new Card("Nine of Clubs", 9));
		deckOfCards.add(new Card("Ten of Clubs", 10));
		deckOfCards.add(new Card("Jack of Clubs", 11));
		deckOfCards.add(new Card("Queen of Clubs", 12));
		deckOfCards.add(new Card("King of Clubs", 13));
		// Hearts
		deckOfCards.add(new Card("Ace of Hearts", 14));
		deckOfCards.add(new Card("One of Hearts", 1));
		deckOfCards.add(new Card("Two of Hearts", 2));
		deckOfCards.add(new Card("Three of Hearts", 3));
		deckOfCards.add(new Card("Four of Hearts", 4));
		deckOfCards.add(new Card("Five of Hearts", 5));
		deckOfCards.add(new Card("Six of Hearts", 6));
		deckOfCards.add(new Card("Seven of Hearts", 7));
		deckOfCards.add(new Card("Eight of Hearts", 8));
		deckOfCards.add(new Card("Nine of Hearts", 9));
		deckOfCards.add(new Card("Ten of Hearts", 10));
		deckOfCards.add(new Card("Jack of Hearts", 11));
		deckOfCards.add(new Card("Queen of Hearts", 12));
		deckOfCards.add(new Card("King of Hearts", 13));
		// Spades
		deckOfCards.add(new Card("Ace of Spades", 14));
		deckOfCards.add(new Card("One of Spades", 1));
		deckOfCards.add(new Card("Two of Spades", 2));
		deckOfCards.add(new Card("Three of Spades", 3));
		deckOfCards.add(new Card("Four of Spaeds", 4));
		deckOfCards.add(new Card("Five of Spades", 5));
		deckOfCards.add(new Card("Six of Spades", 6));
		deckOfCards.add(new Card("Seven of Spades", 7));
		deckOfCards.add(new Card("Eight of Spades", 8));
		deckOfCards.add(new Card("Nine of Spades", 9));
		deckOfCards.add(new Card("Ten of Spades", 10));
		deckOfCards.add(new Card("Jack of Spades", 11));
		deckOfCards.add(new Card("Queen of Spades", 12));
		deckOfCards.add(new Card("King of Spades", 13));
		// Diamonds
		deckOfCards.add(new Card("Ace of Diamonds", 14));
		deckOfCards.add(new Card("One of Diamonds", 1));
		deckOfCards.add(new Card("Two of Diamonds", 2));
		deckOfCards.add(new Card("Three of Diamonds", 3));
		deckOfCards.add(new Card("Four of Diamonds", 4));
		deckOfCards.add(new Card("Five of Diamonds", 5));
		deckOfCards.add(new Card("Six of Diamonds", 6));
		deckOfCards.add(new Card("Seven of Diamonds", 7));
		deckOfCards.add(new Card("Eight of Diamonds", 8));
		deckOfCards.add(new Card("Nine of Diamonds", 9));
		deckOfCards.add(new Card("Ten of Diamonds", 10));
		deckOfCards.add(new Card("Jack of Diamonds", 11));
		deckOfCards.add(new Card("Queen of Diamonds", 12));
		deckOfCards.add(new Card("King of Diamonds", 13));
	}
	
	public void shuffle() {
		Collections.shuffle(deckOfCards); // Collections.shuffle() is used to shuffle lists in java.
	}
	
	public Card draw() {
		Card drawn = deckOfCards.get(0); // Grabs the top card. 
		deckOfCards.remove(0); // Removes card from deck.
		return drawn;
	}
	
	
}
