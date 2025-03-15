package com.skilldistillery.animals.entities;

public class Attendant {

	// make rounds & attend to animals in Animal array, return void
	

	public void makeRounds(Animal[] animals) {
		// check for null 
		System.out.println("Attendant is enroute to feed animals.");
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) {
				System.out.println("Empty enclosure.");
			}
			else { 
				
				System.out.println("Attendant is now feeding " + animals[i].getName() + 
						" their foood.");
				animals[i].makeNoise();
				animals[i].eatFood((int)(Math.random() * 10 + 1));
			}
				
		}
		System.out.println("Feeding time is over.");
	}
	
}
