package pontoon;

public class Player
{
	private String playerName = "playerNameNotSet";
	private int playersGuess = 0;
	public Player()
	{
		
	}
	
	
	public void setName(String name)
	{
		this.playerName = name;
	}
	
	public void setGuess(int guess)
	{
		this.playersGuess = guess;
	}
	
	
	
	
	
	public String getPlayerName()
	{
		return this.playerName;
	}	
	
	public int getGuess()
	{
		return this.playersGuess;
	}
	
}
