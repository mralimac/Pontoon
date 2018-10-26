package pontoon3;

public class Card 
{
	public String cardSuit;
	public int cardValue;
	
	public Card()
	{
		
	}
	
	public Card(int valueOfCard, String cardSuit)
	{
		this.cardSuit = cardSuit;
		this.cardValue = valueOfCard;
	}
	
	public int getCardValue()
	{
		return this.cardValue;
	}
	
	public String getCardSuit()
	{
		return this.cardSuit;
	}
}
