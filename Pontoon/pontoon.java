package buttonExample;
import java.util.Scanner;

public class pontoon {

	
	public static void main(String[] args) {
		
		//Create and assign values to variables		
		
		Scanner kboard = new Scanner(System.in);		
		String choice;
		String cardString = null;
		int i = 0;
		int card1, card2, newcard, total;
		int[] cardsDrawn = new int[10];
		card1 = getRandomNumber();
		cardsDrawn[0] = card1;
		card2 = getRandomNumber();
		cardsDrawn[1] = card2;
		total = calcTotal(card1, card2);
		//Write to Console
		System.out.println("Card 1: "+ card1);
		System.out.println("Card 2: "+ card2);
		System.out.println("Do you wish to continue?");
		
		//Listen for User Input
		choice = kboard.next();
		
		//If user input is Y
		while(choice.equalsIgnoreCase("y")) {
			
			newcard = getRandomNumber();
			cardsDrawn[i + 2] = newcard;
			System.out.println(newcard);
			total = calcTotal(total, newcard);			
			System.out.println("Total: " + total);
			if(busted(total)) {
				System.out.println("Busted!");
				break;
			}
			
			System.out.println("Do you wish to continue?");
			choice = kboard.next();
			i = i + 1;
		}
		//Check if user can still play
		if(getResult(total)) {
			if(didHouseWin(total, houseAI())) {
				System.out.println("You won");
				
			}else {
				System.out.println("You lost");
			}			
		}else {
			System.out.println("You lost");			
		}
		System.out.println("You scored "+ total + " and House scored " + houseAI());
		for(int c = 0; c < cardsDrawn.length; c++) {
			cardString = cardString +","+ cardsDrawn[c];
		}
		System.out.println("Cards Drawn = " + cardString);
	}

	static //Generates a random number
	int getRandomNumber(){		
		int randomNumber = (int) (Math.random()*10);
		return randomNumber;
	}
	
	static //Takes the value of X and Y and adds them together to form the variable of Total
	int calcTotal(int x, int y) {
		int total = x + y;
		return total;
	}
	
	static //Checks if the user is between the values of 18 and 21
	boolean getResult(int z) {
		if(z > 18 && z <= 21) {
			return true;			
		}else {
			return false;
		}
	}
	
	static //Checks if user has exceeded the games win limit of 21
	boolean busted(int z){
		if(z > 21) {
			return true;
		}else {
			return false;
		}		
	}
	
	//Generate random value for the house
	static
	int houseAI(){
		int houseNum = 16 + getRandomNumber()/2;	
		return houseNum;
	}
	
	//Check if house won over the player
	static
	boolean didHouseWin(int playerValue, int houseValue) {
		if(playerValue > houseValue) {
			return true;	
		}else {
			return false;
		}		
	}
	
	//For my own sanity
	void writeToConsole(String inputString) {
		System.out.println(inputString);
	}
	
}
