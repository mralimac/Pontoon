package pontoon3;

import java.util.ArrayList;

public class Game extends Main
{
	//Attributes Section
	private ArrayList<Card> listOfCards = new ArrayList<Card>();
	private int numOfCards;	
	private int totalOnTheTable;
	private int playersGuess;
	//End Attributes
	
	//Constructor Section
	public Game()
	{
		this.numOfCards = 52;
	}
	
	public Game(int numOfCards)
	{
		this.numOfCards = numOfCards;
	}
	//End Constructor
	
	//Method Section
	
	//This function generates a deck of 52 cards in 4 suits
	public void generateDeck()
	{
		String[] suits = {"Heart", "Spade", "Clover", "Diamond"};
		
		for(int x = 0; x < 4; x++)
		{
			for(int i = 0; i < this.numOfCards/4; i++)
			{
				listOfCards.add(new Card(i,suits[x]));
			}
		}
		
	}
	
	public boolean askIfPlayerDraw()
	{
		System.out.println("Do you wish to keep playing?");
		if(getInputString().equals("y"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//This function returns the card based on the index
	public Card getCard(int cardIndex)
	{
		return listOfCards.get(cardIndex);
	}

	public boolean checkIfHouseWon(int houseGuess)
	{
		if(houseGuess == totalOnTheTable)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//This function returns if the game has been won by the player
	public boolean gameWin()
	{
		if(totalOnTheTable == playersGuess)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//This function returns if the game is busted based on the total on the deck being over 21
	public boolean isBusted()
	{
		if(totalOnTheTable > 21)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//This function asks the player for their guess
	public void getPlayersGuess()
	{
		this.playersGuess = getInputInt();
	}
	
	//This function draws a new card
	public void drawNewCard()
	{
		Card newCardDrawn = getCard(getRandomNumber());
		this.totalOnTheTable = this.totalOnTheTable + newCardDrawn.getCardValue();
		System.out.println("The card drawn was " + newCardDrawn.getCardValue());
		System.out.println("This puts the table total to " + this.totalOnTheTable);
	}
	
	//End Method Section
}
