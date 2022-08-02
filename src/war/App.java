package war;

// JAVA WEEK 6 FINAL - App class
// Written by - Joseph Falzini

public class App {
	
	/*
	 * PROJECT INSTRUCTIONS: 
	 *   1.) Instantiate a Deck and two Players, call the shuffle method on the deck.
	 *   2.) Using a traditional for-loop, iterate 52 times calling the draw() method on the other player each iteration using 
	 *      the Deck you instantiated.
	 *   3.) Using a traditional for-loop, iterate 26 times and call the flip() method for each player.
	 *       a.) Compare the value of each card returned by the two player's flip() methods. Call the incrementScore() method
	 *           on the player with the highest card value.
	 *   4.) After the loop, compare the final score from each player.
	 *   5.) Print the final score of each player and either "Player 1", "Player 2", or "Draw" depending on which score is higher
	 *       or if they are both the same.   
 	 *
 	 *
 	 *
	 * WAR Card Game Rules:
	 * 
	 * ## This project simplifies the game and does not require a "War" in the case of a draw.
	 *    A draw results in no points given to either Player.
	 *    
	 *   1.) Each player turns up a card at the same time and the player with the higher card takes both cards and puts them, 
	 *       face down, on the bottom of his stack.
	 *   2.) If the cards are the same rank, it is War. Each player turns up one card face down and one card face up. 
	 *       The player with the higher cards takes both piles (six cards). If the turned-up cards are again the same rank,
	 *       each player places another card face down and turns another card face up. 
	 */

	public static void main(String[] args) {
		
		Deck deck = new Deck(); 
		Player player1 = new Player("Joseph"); 
		Player player2 = new Player("Vinny"); 
		
		deck.shuffle();
		
		// 26 cards per player
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 1) {
				player1.draw(deck);
			} else if (i % 2 == 0) {
				player2.draw(deck);
			}
		}
		
		// player1.describe(); - used to verify each player gets 26 cards.
		// player2.describe(); - used to verify each player gets 26 cards.
		
		// 26 Rounds of Play; each iteration tells the round # and each player's card, along with the winner of the round.
		for (int i = 0; i < 26; i++) {
			System.out.println("Round " + (i + 1) + ": ");
			Card p1 = player1.flip();
			Card p2 = player2.flip();
			int p1Value = p1.getValue();
			int p2Value = p2.getValue();
			
			System.out.println(player1.getName() + "'s card - " + p1.getName());
			System.out.println(player2.getName() + "'s card - " + p2.getName());
			
			if (p1Value > p2Value) {
				System.out.println(player1.getName() + " wins the round!\n");
				player1.incrementScore();
			} else if (p1Value < p2Value) {
				System.out.println(player2.getName() + " wins the round!\n");
				player2.incrementScore();
			} else {
				System.out.println("DRAW! No score changes!\n");
			}

		}
		
		int player1Score = player1.getScore();
		int player2Score = player2.getScore();
		
		System.out.println("Results: " + player1.getName() + " - " + player1Score +
							" || " + player2.getName() + " - " + player2Score);
		
		if (player1Score > player2Score) {
			System.out.println(player1.getName() + " has won the game!!");
		} else if (player1Score < player2Score) {
			System.out.println(player2.getName() + " has won the game!!");
		} else {
			System.out.println("DRAW!!");
		}
	}

}
