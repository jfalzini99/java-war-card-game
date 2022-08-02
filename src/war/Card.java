package war;

// JAVA WEEK 6 FINAL - Card class
// Written by - Joseph Falzini 

public class Card {
	
	/*
	 * Card Class:
	 *  - Fields
	 *     # int value - contains a value from 2 to 14 representing cards 2 - Ace (2 = 2 & 14 = Ace).
	 *     # String name - card description (EX: Ace of Diamonds, Two of Hearts, Three of Spades, etc.).
	 *    
	 *  - Methods
	 *     # Card() - constructor for the Card class; takes a String name and an Integer value.
	 *     # Getters and Setters.
	 *     # describe() - prints of the description of the card 
	 *       - This class only needs to return the value of 'String name' since the value will only be used
	 *         to compare the values of opposing player's cards. 
	 */

	private int value;
	private String name;
	
	public Card(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void describe() {
		System.out.println(name);
	}
	
}
