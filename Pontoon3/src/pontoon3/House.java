package pontoon3;

public class House extends Main
{
	private int houseGuess; 
	
	public House()
	{
		this.houseGuess = 15 + getRandomNumber();
	}
	
	public House(int houseGuess)
	{
		this.houseGuess = houseGuess;
	}
	
	public int getHousesGuess()
	{
		return this.houseGuess;
	}
}
