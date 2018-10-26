package pontoon3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main 
{
	Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		House housePlayer = new House();
		Game game = new Game();
		game.generateDeck();
		game.getPlayersGuess();
		if(game.askIfPlayerDraw())
		{
			game.drawNewCard();
			
		}
		else
		{
			if(game.isBusted())
			{
				System.out.println("Game is busted");
			}
			
			if(game.checkIfHouseWon(housePlayer.getHousesGuess()))
			{
				System.out.println("House has guessed correctly");
			}
			
			if(!game.checkIfHouseWon(housePlayer.getHousesGuess()) && game.gameWin())
			{
				System.out.println("The player has won!");
			}
				
		}
	}
	
	public int getInputInt()
	{
		while(true)
		{
			try
			{
				return inputScanner.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("Incorrect Input Format");
			}
		}
	}
	
	public String getInputString()
	{
		return inputScanner.next();
	}
	
	public int getRandomNumber()
	{
		return (int) (Math.random()*10);
	}
}
