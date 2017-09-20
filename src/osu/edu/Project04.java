package osu.edu;

import java.util.Random;
import java.util.Scanner;

public class Project04 {

	public static void main(String[] args) {
		
		//Starts a new scanner
		Scanner scan = new Scanner(System.in);
		
		//Dragon array
		String[] _dragons = {"Fire", "Plant", "Water"};
		
		//Prompts the user for dragon selection
		p("Please select one of your dragons [Fire/Plant/Water]: ", false);
		
		//Gets the users dragon selection
		String _usrDragon = scan.nextLine();
		
		//Starts the random num gen
		Random _rand = new Random();
		
		//gets a random number
		int _randNum = _rand.nextInt(2);
		
		//converts single char to word
		if(_usrDragon.equalsIgnoreCase("F"))
		{
			_usrDragon = "Fire";
		}
		else if(_usrDragon.equalsIgnoreCase("W"))
		{
			_usrDragon = "Water";
		}
		else if(_usrDragon.equalsIgnoreCase("P"))
		{
			_usrDragon = "Plant";
		}
		
		//Prints players choice
		if(_dragons[0].equals(_usrDragon) || _dragons[1].equals(_usrDragon) || _dragons[2].equals(_usrDragon)){
			
			//Prints the users choice to the screen
			p("You Chose: " + _usrDragon + " dragon", true);
			
			
			
		}
		else
		{
			
			//Prints the users choice to the screen
			p("You don't have a " + _usrDragon + " dragon, so you choose no dragons.", true);
			
		}
		
		//prints the computers choice
		p("I Chose: " + _dragons[_randNum] + " dragon", true);
		
		/*
		 *  0 = Fire
		 *  1 = Plant
		 *  3 = Water
		 */
		
		//Decides who the winner is
		if(_dragons[_randNum].equalsIgnoreCase(_usrDragon))
		{
			
			//If both choices the same dragon
			p("A Tie!", true);
			
		}
		
		//If Player chooses Water and COmputer choses Fire
		else if(_usrDragon.equalsIgnoreCase("Water") && _dragons[_randNum].equalsIgnoreCase("Fire"))
		{
			p(_usrDragon + " defeates " + _dragons[_randNum] + " you win!", true);
		}
		
		//If Player chooses Fire and Computer choses Plant
		else if(_usrDragon.equalsIgnoreCase("Fire") && _dragons[_randNum].equalsIgnoreCase("Plant"))
		{
			p(_usrDragon + " defeates " + _dragons[_randNum] + " you win!", true);
		}	
			
		//If Player chooses Plant and COmputer choses Water
		else if(_usrDragon.equalsIgnoreCase("Plant") && _dragons[_randNum].equalsIgnoreCase("Water"))
		{
			p(_usrDragon + " defeates " + _dragons[_randNum] + " you win!", true);
		}
		
		//If Player chooses a not a dragon
		else if(!_usrDragon.equalsIgnoreCase("Plant") || !_usrDragon.equalsIgnoreCase("Water") || !_usrDragon.equalsIgnoreCase("Fire"))
		{
			p("You lose by default!", true);
		}
		
		else
		{
			p(_dragons[_randNum] + " beats " + _usrDragon + " - you lose!", true);
		}
		
		scan.close();
		
		
		
		
		

	}
	
	public static void p(String s, boolean bool)
	{
		if(bool)
		{
			System.out.println(s);
		}
		else
		{
			System.out.print(s);
		}
	}

}
