package com.skilldistillery.animals.app;

import java.util.Scanner;

import com.skilldistillery.animals.entities.Cow;
import com.skilldistillery.animals.entities.Duck;
import com.skilldistillery.animals.entities.Lion;
import com.skilldistillery.animals.entities.Whale;

public class AnimalSanctuaryApp {
	
	private Scanner kb;
	private Sanctuary sanctuary;
	

	// TODO Instantiate a Sanctuary - done
	// TODO Instantiate an Attendant - done
	// TODO Add attendant to sanctuary - done
	
	// Create and add animals to sanctuary
	// BY NEW WHALE, DUCK SUBCLASSES NOT in animal
	
	// Tell sanctuary to list the animals with sysout welcome, here are the animals we have
	
	// Tell sanctuary to start attendant rounds
	
	// diagram tells what methods and fields to create

	public static void main(String[] args) {
	// SET FIRST DOMINO IN MOTION
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
	
		app.launchApp();
		
	}
	
	private void launchApp() {
		 	kb = new Scanner(System.in);
		 	sanctuary = new Sanctuary();
			System.out.println("\n\n\n");
			
			boolean menuLoop = true;
			String menuChoice;
			
			while (menuLoop) {
				System.out.println("1. Show a list of current animals.");
				System.out.println("2. Add animal.");
				System.out.println("3. See attendant feed animals.");
				System.out.println("4. Exit.");
			menuChoice = kb.next();
			
			switch(menuChoice) {
			case "1":{
				sanctuary.listAnimals();
				continue;
				}
			case "2":{
				System.out.println("What's the animal's name?");
				String name = kb.next();
				System.out.println("What type of animal?");
				System.out.println("1. Whale");
				System.out.println("2. Lion");
				System.out.println("3. Duck");
				System.out.println("4. Cow");
				String animalChoice = kb.next();
				switch(animalChoice) {
				case "1":{
					Whale newAnimal = new Whale(name);
					sanctuary.addAnimal(newAnimal);
					break;
				}
				case "2":{
					Lion newAnimal = new Lion(name);
					sanctuary.addAnimal(newAnimal);
					break;
				}
				case "3":{
					Duck newAnimal = new Duck(name);
					sanctuary.addAnimal(newAnimal);
					break;
				}
				case "4":{
					Cow newAnimal = new Cow(name);
					sanctuary.addAnimal(newAnimal);
					break;
				}
				default: System.out.println("Not a menu item.");
				
				}
				continue;
				}
			case "3":{
				// start rounds
				sanctuary.startAttendantRounds();
				continue;
			}
			case "4":{
				// exit
				System.out.println("Thanks for visiting.");
				menuLoop = false;
				break;
			}
			}
			}
				
	}
}
