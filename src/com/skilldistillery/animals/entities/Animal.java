package com.skilldistillery.animals.entities;

public class Animal {
	// each animal has a name (private) - done
	// each animal can make a sound - done in subclass
	// each species has a subclass that defines its unique state and behavior - done   

	// One field for each particular animal's name - done
	// get and set methods for each animal instance's name field (private to that
	// subclass) - NO used super

	// can use source menu to generate getters and setters - DONE
	// getter returns name - DONE
	// setter with void return type for name - DONE

	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public void makeNoise() {
		System.out.println("");
	}

	public void eatFood(int amount) {
		System.out.println("");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}