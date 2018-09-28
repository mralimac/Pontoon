package pontoon;

public class Card {
	private int cardValue;
	public Card()
	{
		
	}
	
	public void setCardValue(int cardValue)
	{
		this.cardValue = cardValue;
	}
	
	public void setRandValue()
	{
		this.cardValue = (int) ((Math.random()*10)+1);
	}
	
	public int getCardValue()
	{
		return this.cardValue;
	}
}
