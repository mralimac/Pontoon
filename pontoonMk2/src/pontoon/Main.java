package pontoon;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Player player1 = new Player();
		player1.setName(getString());
		Game initGame = new Game();
		initGame.startGame();
		
	}
	
	
	
	public static String getString()
	{
		Scanner stringScanner = new Scanner(System.in);
		return stringScanner.next();		
	}
	
	public static int getInt()
	{
		Scanner intScanner = new Scanner(System.in);
		while(true)
		{
			try
			{
				return Integer.parseInt(intScanner.next());
			}
			catch(NumberFormatException e)
			{
				
			}
		}
	}

}
