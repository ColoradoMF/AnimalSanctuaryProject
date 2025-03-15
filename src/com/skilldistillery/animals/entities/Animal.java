package com.skilldistillery.animals.entities;

public class Animal {
	// each animal has a name (private)
	// each animal can make a sound
	// each species has a subclass that defines its unique state and behavior

	// One field for each particular animal's name
	// get and set methods for each animal instance's name field (private to that
	// subclass)

	// can use source menu to generate getters and setters
	// getter returns name
	// setter with void return type for name

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public void makeNoise() {
		System.out.println("You shouldn't be seeing this Animal.");
		
	}

	public void eatFood(int amount) {
		System.out.println("You shouldn't be seeing this Animal.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}