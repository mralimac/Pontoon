package pontoon;

import java.util.ArrayList;

public class Game {
	int max;
	int min;
	Card card;
	ArrayList<Card> listOfCards;
	public Game()
	{
		
	}
	
	public void startGame()
	{
		for(int i = 0; i < 2; i++)
		{
			Card currentCard = new Card();
			currentCard.setRandValue();
			listOfCards.add(currentCard);	
		}
		//Have players guess the random number value
		
		//Check if any player is over 20
		//If not over 20 then ask to draw again
		
	}
}
