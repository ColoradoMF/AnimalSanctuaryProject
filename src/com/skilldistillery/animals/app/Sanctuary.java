package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.Animal;
import com.skilldistillery.animals.entities.Attendant;

public class Sanctuary {

	// animal array created in Sanctuary
	// method to add an animal to array?
	// attendant created in Sanctuary
	
	private Animal[] animals = new Animal[5];
		
	private Attendant attendant = new Attendant();
	
	public void setAttendant(Attendant attendant) {
		
	}
	
	public void listAnimals() {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println(animals[i]);
			}
		}
	}
	
	public void addAnimal(Animal animal) {
		
	}
	
	public void startAttendantRounds() {

	}
}