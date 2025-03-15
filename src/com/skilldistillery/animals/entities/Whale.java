package com.skilldistillery.animals.entities;

public class Whale extends Animal {

	// TODO method to make noise: quack, moo or roar DONE
	// TODO method to eat food DONE

	private static String noise = "singing song";

	public Whale(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eatFood(int foodAmount) {
		System.out.println("Gulp gulp " + foodAmount + " tons of krill.");
	}

}